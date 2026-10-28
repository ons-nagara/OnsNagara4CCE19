package tn.esprit.onsnagara4cce19.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;

    @OneToMany(mappedBy = "agence")
    List<Employe> employes = new ArrayList<>();

    @OneToMany(mappedBy = "agence")
    List<Vehicule> vehicules = new ArrayList<>();
}