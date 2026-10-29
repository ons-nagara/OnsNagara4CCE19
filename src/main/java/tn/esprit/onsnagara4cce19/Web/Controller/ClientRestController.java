package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Client;
import tn.esprit.onsnagara4cce19.Services.Impls.ClientService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/clients")
@RestController
public class ClientRestController {
    private final ClientService clientService;

    @PostMapping
    public Client add(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping("/{id}")
    public Client get(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PutMapping
    public Client update(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping
    public List<Client> getAll() {
        return clientService.getAllClients();
    }
}