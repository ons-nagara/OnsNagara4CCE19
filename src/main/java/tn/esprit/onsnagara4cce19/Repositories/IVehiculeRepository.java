package tn.esprit.onsnagara4cce19.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.onsnagara4cce19.Domain.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
}
