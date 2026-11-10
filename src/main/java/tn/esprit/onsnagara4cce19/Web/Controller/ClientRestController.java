package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Client;
import tn.esprit.onsnagara4cce19.Services.Impls.ClientService;

import java.util.List;

@Tag(name = "Gestion des clients", description = "CRUD de l'entité Client")
@RequiredArgsConstructor
@RequestMapping("/clients")
@RestController
public class ClientRestController {
    private final ClientService clientService;

    @Operation(summary = "Récupérer la liste complète des clients")
    @GetMapping
    public List<Client> findAll() {
        return clientService.getAllClients();
    }

    @Operation(summary = "Récupérer un client par son identifiant")
    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @Operation(summary = "Ajouter un client")
    @PostMapping
    public Client create(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @Operation(summary = "Modifier un client")
    @PutMapping
    public Client update(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @Operation(summary = "Supprimer un client par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}