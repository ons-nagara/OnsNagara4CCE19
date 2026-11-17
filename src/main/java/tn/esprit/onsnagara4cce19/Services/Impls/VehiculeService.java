package tn.esprit.onsnagara4cce19.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.onsnagara4cce19.Domain.Vehicule;
import tn.esprit.onsnagara4cce19.Repositories.IVehiculeRepository;
import tn.esprit.onsnagara4cce19.Services.IVehiculeService;
import tn.esprit.onsnagara4cce19.Domain.Agence;
import tn.esprit.onsnagara4cce19.Repositories.IAgenceRepository;
import tn.esprit.onsnagara4cce19.Domain.Equipement;
import tn.esprit.onsnagara4cce19.Repositories.IEquipementRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeService implements IVehiculeService {


    private final IVehiculeRepository vehiculeRepository;
    private final IAgenceRepository agenceRepository;
    private final IEquipementRepository equipementRepository;

    @Override
    public Vehicule createVehicule(Vehicule vehicule) {

        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {

        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {

        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {

        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> getAllVehicules() {

        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule assignVehiculeToAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);
        Agence agence = agenceRepository.findById(idAgence).orElse(null);
        if (vehicule != null && agence != null) {
            vehicule.setAgence(agence);
            return vehiculeRepository.save(vehicule);
        }
        return null;
    }

    @Override
    public Vehicule assignVehiculeToEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);
        Equipement equipement = equipementRepository.findById(idEquipement).orElse(null);
        if (vehicule != null && equipement != null) {
            vehicule.getEquipements().add(equipement);
            return vehiculeRepository.save(vehicule);
        }
        return null;
    }

    @Override
    public Vehicule assignVehiculeToAgenceAndEquipement(Long idVehicule, Long idAgence, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);
        Agence agence = agenceRepository.findById(idAgence).orElse(null);
        Equipement equipement = equipementRepository.findById(idEquipement).orElse(null);
        if (vehicule != null && agence != null && equipement != null) {
            vehicule.setAgence(agence);
            vehicule.getEquipements().add(equipement);
            return vehiculeRepository.save(vehicule);
        }
        return null;
    }

}
