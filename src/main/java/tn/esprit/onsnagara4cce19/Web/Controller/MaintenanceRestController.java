package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Maintenance;
import tn.esprit.onsnagara4cce19.Services.Impls.MaintenanceService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/maintenances")
@RestController
public class MaintenanceRestController {
    private final MaintenanceService maintenanceService;

    @PostMapping
    public Maintenance add(@RequestBody Maintenance maintenance) {
        return maintenanceService.createMaintenance(maintenance);
    }

    @GetMapping("/{id}")
    public Maintenance get(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @PutMapping
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping
    public List<Maintenance> getAll() {
        return maintenanceService.getAllMaintenances();
    }
}