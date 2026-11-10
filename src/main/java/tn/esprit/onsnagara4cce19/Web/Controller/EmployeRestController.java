package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Employe;
import tn.esprit.onsnagara4cce19.Services.Impls.EmployeService;

import java.util.List;

@Tag(name = "Gestion des employés", description = "CRUD de l'entité Employe")
@RequiredArgsConstructor
@RequestMapping("/employes")
@RestController
public class EmployeRestController {
    private final EmployeService employeService;

    @Operation(summary = "Récupérer la liste complète des employés")
    @GetMapping
    public List<Employe> findAll() {
        return employeService.getAllEmployes();
    }

    @Operation(summary = "Récupérer un employé par son identifiant")
    @GetMapping("/{id}")
    public Employe findById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @Operation(summary = "Ajouter un employé")
    @PostMapping
    public Employe create(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }

    @Operation(summary = "Modifier un employé")
    @PutMapping
    public Employe update(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @Operation(summary = "Supprimer un employé par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}