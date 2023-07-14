package com.example.ms_gestionClient.service;

import java.util.List;

import com.example.ms_gestionClient.entities.Client;

public interface IClientService {
	public Client addCandidat(Client c);
	public List<Client> getCandidats ();
	public Client getById(int Id);
}
