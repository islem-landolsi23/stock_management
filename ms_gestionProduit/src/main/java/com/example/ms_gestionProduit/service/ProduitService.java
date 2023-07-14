package com.example.ms_gestionProduit.service;

import java.util.List;

import com.example.ms_gestionProduit.entities.Produit;

public interface ProduitService {
    public Produit addCandidat(Produit c);
    public List<Produit> getCandidats ();
    public Produit getById(int idProduit);
}






