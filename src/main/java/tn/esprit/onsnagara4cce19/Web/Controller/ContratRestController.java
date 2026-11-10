package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Contrat;
import tn.esprit.onsnagara4cce19.Services.Impls.ContratService;

import java.util.List;

@Tag(name = "Gestion des contrats", description = "CRUD de l'entité Contrat")
@RequiredArgsConstructor
@RequestMapping("/contrats")
@RestController
public class ContratRestController {
    private final ContratService contratService;

    @Operation(summary = "Récupérer la liste complète des contrats")
    @GetMapping
    public List<Contrat> findAll() {
        return contratService.getAllContrats();
    }

    @Operation(summary = "Récupérer un contrat par son identifiant")
    @GetMapping("/{id}")
    public Contrat findById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @Operation(summary = "Ajouter un contrat")
    @PostMapping
    public Contrat create(@RequestBody Contrat contrat) {
        return contratService.createContrat(contrat);
    }

    @Operation(summary = "Modifier un contrat")
    @PutMapping
    public Contrat update(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @Operation(summary = "Supprimer un contrat par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }
}