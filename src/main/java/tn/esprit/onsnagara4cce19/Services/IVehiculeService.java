package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();
    Vehicule assignVehiculeToAgence(Long idVehicule, Long idAgence);
    Vehicule assignVehiculeToEquipement(Long idVehicule, Long idEquipement);
    Vehicule assignVehiculeToAgenceAndEquipement(Long idVehicule, Long idAgence, Long idEquipement);
    Vehicule unassignVehiculeFromAgence(Long idVehicule);
    Vehicule unassignVehiculeFromEquipement(Long idVehicule, Long idEquipement);
    Vehicule unassignVehiculeFromAgenceAndEquipement(Long idVehicule, Long idEquipement);


}
