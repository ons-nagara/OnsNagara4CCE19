package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe createEmploye(Employe employe);
    Employe getEmployeById(Long id);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(Long id);
    List<Employe> getAllEmployes();
}