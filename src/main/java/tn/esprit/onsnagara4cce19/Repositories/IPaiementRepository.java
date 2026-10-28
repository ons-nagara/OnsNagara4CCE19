package tn.esprit.onsnagara4cce19.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.onsnagara4cce19.Domain.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long> {
}