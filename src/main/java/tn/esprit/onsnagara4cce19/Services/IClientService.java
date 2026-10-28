package tn.esprit.onsnagara4cce19.Services;

import tn.esprit.onsnagara4cce19.Domain.Client;

import java.util.List;

public interface IClientService {
    Client createClient(Client client);
    Client getClientById(Long id);
    Client updateClient(Client client);
    void deleteClient(Long id);
    List<Client> getAllClients();
}