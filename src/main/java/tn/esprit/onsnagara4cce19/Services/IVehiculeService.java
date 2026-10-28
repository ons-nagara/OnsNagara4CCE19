package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();

}
