package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Vehicule;
import tn.esprit.onsnagara4cce19.Services.Impls.VehiculeService;

@RequiredArgsConstructor
@RequestMapping("/vehicules")
@RestController
public class VehiculeRestController {
    private final VehiculeService vehiculeService;


    @PostMapping
    public Vehicule add(@RequestBody Vehicule vehicule) {
        return vehiculeService.createVehicule(vehicule);
    }

    @GetMapping("/{id}")
    public Vehicule get(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @PutMapping
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

}