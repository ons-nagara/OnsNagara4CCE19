package tn.esprit.onsnagara4cce19.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    @ManyToOne(fetch = FetchType.EAGER)
    Vehicule vehicule;

    @ManyToOne(fetch = FetchType.EAGER)
    Client client;

    @OneToOne(fetch = FetchType.EAGER)
    Contrat contrat;
}