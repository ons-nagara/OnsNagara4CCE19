package tn.esprit.onsnagara4cce19.Services.Impls;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.onsnagara4cce19.Domain.Contrat;
import tn.esprit.onsnagara4cce19.Repositories.IContratRepository;
import tn.esprit.onsnagara4cce19.Services.IContratService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContratService implements IContratService {

    private final IContratRepository contratRepository;

    @Override
    public Contrat createContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }
}