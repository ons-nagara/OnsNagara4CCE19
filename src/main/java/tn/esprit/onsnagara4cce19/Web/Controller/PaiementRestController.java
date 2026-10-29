package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Paiement;
import tn.esprit.onsnagara4cce19.Services.Impls.PaiementService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/paiements")
@RestController
public class PaiementRestController {
    private final PaiementService paiementService;

    @PostMapping
    public Paiement add(@RequestBody Paiement paiement) {
        return paiementService.createPaiement(paiement);
    }

    @GetMapping("/{id}")
    public Paiement get(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @PutMapping
    public Paiement update(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }

    @GetMapping
    public List<Paiement> getAll() {
        return paiementService.getAllPaiements();
    }
}