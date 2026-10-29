package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Agence;
import tn.esprit.onsnagara4cce19.Services.Impls.AgenceService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/agences")
@RestController
public class AgenceRestController {
    private final AgenceService agenceService;

    @PostMapping
    public Agence add(@RequestBody Agence agence) {
        return agenceService.createAgence(agence);
    }

    @GetMapping("/{id}")
    public Agence get(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @PutMapping
    public Agence update(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }

    @GetMapping
    public List<Agence> getAll() {
        return agenceService.getAllAgences();
    }
}