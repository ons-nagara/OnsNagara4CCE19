package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence agence);
    Agence getAgenceById(Long id);
    Agence updateAgence(Agence agence);
    void deleteAgence(Long id);
    List<Agence> getAllAgences();
}