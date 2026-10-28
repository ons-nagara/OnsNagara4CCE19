package tn.esprit.onsnagara4cce19.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;
    String immatriculation;
    String marque;
    String modele;
    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;
    BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    StatutVehicule statut;

    @ManyToOne(fetch = FetchType.LAZY)
    Agence agence;

    @ManyToMany
    Set<Equipement> equipements = new HashSet<>();

    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.PERSIST)
    List<Reservation> reservations = new ArrayList<>();
}