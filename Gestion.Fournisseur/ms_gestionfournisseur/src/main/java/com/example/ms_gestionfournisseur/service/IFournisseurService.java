package com.example.ms_gestionfournisseur.service;

import java.util.List;

import com.example.ms_gestionfournisseur.entities.Fournisseur;

public interface IFournisseurService {
	public Fournisseur addFournisseur(Fournisseur c);
	public List<Fournisseur> getFournisseur ();
	public Fournisseur getById(int Id);
}
