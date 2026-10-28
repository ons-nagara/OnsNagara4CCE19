package tn.esprit.onsnagara4cce19.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiement;
    BigDecimal montant;
    LocalDate datePaiement;
    @Enumerated(EnumType.STRING)
    ModePaiement modePaiement;

    @ManyToOne(fetch = FetchType.LAZY)
    Contrat contrat;
}