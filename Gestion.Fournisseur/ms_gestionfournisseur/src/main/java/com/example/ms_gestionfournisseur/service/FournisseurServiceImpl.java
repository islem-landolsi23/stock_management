package com.example.ms_gestionfournisseur.service;

import java.util.List;

import com.example.ms_gestionfournisseur.entities.Fournisseur;
import com.example.ms_gestionfournisseur.repository.FournisseurRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournisseurServiceImpl implements IFournisseurService {
	@Autowired
	FournisseurRepsitory repo;
	@Override
	public Fournisseur addFournisseur(Fournisseur c) {
		return repo.save(c);
	}

	@Override
	public List<Fournisseur> getFournisseur() {
		return repo.findAll();
	}

	@Override
	public Fournisseur getById(int id) {
		return repo.findById(id).get();
	}

}
