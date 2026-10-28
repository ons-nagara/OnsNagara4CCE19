package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement equipement);
    Equipement getEquipementById(Long id);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(Long id);
    List<Equipement> getAllEquipements();
}