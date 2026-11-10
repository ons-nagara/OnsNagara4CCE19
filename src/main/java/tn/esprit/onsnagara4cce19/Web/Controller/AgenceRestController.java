package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Agence;
import tn.esprit.onsnagara4cce19.Services.Impls.AgenceService;

import java.util.List;

@Tag(name = "Gestion des agences", description = "CRUD de l'entité Agence")
@RequiredArgsConstructor
@RequestMapping("/agences")
@RestController
public class AgenceRestController {
    private final AgenceService agenceService;

    @Operation(summary = "Récupérer la liste complète des agences")
    @GetMapping
    public List<Agence> findAll() {
        return agenceService.getAllAgences();
    }

    @Operation(summary = "Récupérer une agence par son identifiant")
    @GetMapping("/{id}")
    public Agence findById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @Operation(summary = "Ajouter une agence")
    @PostMapping
    public Agence create(@RequestBody Agence agence) {
        return agenceService.createAgence(agence);
    }

    @Operation(summary = "Modifier une agence")
    @PutMapping
    public Agence update(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @Operation(summary = "Supprimer une agence par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }
}