package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Contrat;
import tn.esprit.onsnagara4cce19.Services.Impls.ContratService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/contrats")
@RestController
public class ContratRestController {
    private final ContratService contratService;

    @PostMapping
    public Contrat add(@RequestBody Contrat contrat) {
        return contratService.createContrat(contrat);
    }

    @GetMapping("/{id}")
    public Contrat get(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @PutMapping
    public Contrat update(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @GetMapping
    public List<Contrat> getAll() {
        return contratService.getAllContrats();
    }
}