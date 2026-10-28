package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat createContrat(Contrat contrat);
    Contrat getContratById(Long id);
    Contrat updateContrat(Contrat contrat);
    void deleteContrat(Long id);
    List<Contrat> getAllContrats();
}