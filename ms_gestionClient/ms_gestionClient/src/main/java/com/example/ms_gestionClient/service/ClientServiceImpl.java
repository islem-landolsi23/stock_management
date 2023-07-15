package com.example.ms_gestionClient.service;

import java.util.List;

import com.example.ms_gestionClient.entities.Client;
import com.example.ms_gestionClient.repository.ClientRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {
	@Autowired
	ClientRepsitory repo;
	@Override
	public Client addClient(Client c) {
		return repo.save(c);
	}

	@Override
	public List<Client> getClients() {
		return repo.findAll();
	}

	@Override
	public Client getById(int id) {
		return repo.findById(id).get();
	}

}
