package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Maintenance;
import tn.esprit.onsnagara4cce19.Services.Impls.MaintenanceService;

import java.util.List;

@Tag(name = "Gestion des maintenances", description = "CRUD de l'entité Maintenance")
@RequiredArgsConstructor
@RequestMapping("/maintenances")
@RestController
public class MaintenanceRestController {
    private final MaintenanceService maintenanceService;

    @Operation(summary = "Récupérer la liste complète des maintenances")
    @GetMapping
    public List<Maintenance> findAll() {
        return maintenanceService.getAllMaintenances();
    }

    @Operation(summary = "Récupérer une maintenance par son identifiant")
    @GetMapping("/{id}")
    public Maintenance findById(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @Operation(summary = "Ajouter une maintenance")
    @PostMapping
    public Maintenance create(@RequestBody Maintenance maintenance) {
        return maintenanceService.createMaintenance(maintenance);
    }

    @Operation(summary = "Modifier une maintenance")
    @PutMapping
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @Operation(summary = "Supprimer une maintenance par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}