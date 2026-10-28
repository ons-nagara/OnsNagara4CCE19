package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance createMaintenance(Maintenance maintenance);
    Maintenance getMaintenanceById(Long id);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);
    List<Maintenance> getAllMaintenances();
}