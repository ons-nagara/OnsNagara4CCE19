package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Employe;
import tn.esprit.onsnagara4cce19.Services.Impls.EmployeService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/employes")
@RestController
public class EmployeRestController {
    private final EmployeService employeService;

    @PostMapping
    public Employe add(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }

    @GetMapping("/{id}")
    public Employe get(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @PutMapping
    public Employe update(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping
    public List<Employe> getAll() {
        return employeService.getAllEmployes();
    }
}