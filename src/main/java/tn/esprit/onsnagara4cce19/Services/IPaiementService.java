package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement paiement);
    Paiement getPaiementById(Long id);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(Long id);
    List<Paiement> getAllPaiements();
}