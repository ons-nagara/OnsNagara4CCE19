package tn.esprit.onsnagara4cce19.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne(fetch = FetchType.EAGER)
    Agence agence;

    @ManyToMany(fetch = FetchType.LAZY)
    Set<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
    List<Reservation> reservations;
}