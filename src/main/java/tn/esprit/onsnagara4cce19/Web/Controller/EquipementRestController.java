package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Equipement;
import tn.esprit.onsnagara4cce19.Services.Impls.EquipementService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/equipements")
@RestController
public class EquipementRestController {
    private final EquipementService equipementService;

    @PostMapping
    public Equipement add(@RequestBody Equipement equipement) {
        return equipementService.createEquipement(equipement);
    }

    @GetMapping("/{id}")
    public Equipement get(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @PutMapping
    public Equipement update(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }

    @GetMapping
    public List<Equipement> getAll() {
        return equipementService.getAllEquipements();
    }
}