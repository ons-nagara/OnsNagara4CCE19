package tn.esprit.onsnagara4cce19.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.onsnagara4cce19.Domain.Equipement;
import tn.esprit.onsnagara4cce19.Repositories.IEquipementRepository;
import tn.esprit.onsnagara4cce19.Services.IEquipementService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EquipementService implements IEquipementService {

    private final IEquipementRepository equipementRepository;

    @Override
    public Equipement createEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }
}