package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Paiement;
import tn.esprit.onsnagara4cce19.Services.Impls.PaiementService;

import java.util.List;

@Tag(name = "Gestion des paiements", description = "CRUD de l'entité Paiement")
@RequiredArgsConstructor
@RequestMapping("/paiements")
@RestController
public class PaiementRestController {
    private final PaiementService paiementService;

    @Operation(summary = "Récupérer la liste complète des paiements")
    @GetMapping
    public List<Paiement> findAll() {
        return paiementService.getAllPaiements();
    }

    @Operation(summary = "Récupérer un paiement par son identifiant")
    @GetMapping("/{id}")
    public Paiement findById(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @Operation(summary = "Ajouter un paiement")
    @PostMapping
    public Paiement create(@RequestBody Paiement paiement) {
        return paiementService.createPaiement(paiement);
    }

    @Operation(summary = "Modifier un paiement")
    @PutMapping
    public Paiement update(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @Operation(summary = "Supprimer un paiement par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}