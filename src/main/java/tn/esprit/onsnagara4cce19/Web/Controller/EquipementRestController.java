package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Equipement;
import tn.esprit.onsnagara4cce19.Services.Impls.EquipementService;

import java.util.List;

@Tag(name = "Gestion des équipements", description = "CRUD de l'entité Equipement")
@RequiredArgsConstructor
@RequestMapping("/equipements")
@RestController
public class EquipementRestController {
    private final EquipementService equipementService;

    @Operation(summary = "Récupérer la liste complète des équipements")
    @GetMapping
    public List<Equipement> findAll() {
        return equipementService.getAllEquipements();
    }

    @Operation(summary = "Récupérer un équipement par son identifiant")
    @GetMapping("/{id}")
    public Equipement findById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @Operation(summary = "Ajouter un équipement")
    @PostMapping
    public Equipement create(@RequestBody Equipement equipement) {
        return equipementService.createEquipement(equipement);
    }

    @Operation(summary = "Modifier un équipement")
    @PutMapping
    public Equipement update(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @Operation(summary = "Supprimer un équipement par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}