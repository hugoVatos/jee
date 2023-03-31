package fr.esgi.plage.service;

import java.util.List;

import fr.esgi.plage.business.Client;
import fr.esgi.plage.dto.ClientDto;

public interface ClientService {
	
	Client createClient(Client client);

	List<Client> getAllClients();

	Client getClient(Long id);

	Client modifyClient(ClientDto clientDto);

}
