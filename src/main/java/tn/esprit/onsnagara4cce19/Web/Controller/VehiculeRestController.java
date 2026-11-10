package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Vehicule;
import tn.esprit.onsnagara4cce19.Services.Impls.VehiculeService;

import java.util.List;

@Tag(name = "Gestion des véhicules", description = "CRUD de l'entité Vehicule")
@RequiredArgsConstructor
@RequestMapping("/vehicules")
@RestController
public class VehiculeRestController {
    private final VehiculeService vehiculeService;

    @Operation(summary = "Récupérer la liste complète des véhicules")
    @GetMapping
    public List<Vehicule> findAll() {
        return vehiculeService.getAllVehicules();
    }

    @Operation(summary = "Récupérer un véhicule par son identifiant")
    @GetMapping("/{id}")
    public Vehicule findById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @Operation(summary = "Ajouter un véhicule")
    @PostMapping
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return vehiculeService.createVehicule(vehicule);
    }

    @Operation(summary = "Modifier un véhicule")
    @PutMapping
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @Operation(summary = "Supprimer un véhicule par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}