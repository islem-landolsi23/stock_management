package com.example.ms_gestionClient.service;

import java.util.List;

import com.example.ms_gestionClient.entities.Client;

public interface IClientService {
	public Client addClient(Client c);
	public List<Client> getClients ();
	public Client getById(int Id);
}
