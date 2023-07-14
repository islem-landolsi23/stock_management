package com.example.ms_gestionProduit.service;

import java.util.List;

import com.example.ms_gestionProduit.entities.Produit;
import com.example.ms_gestionProduit.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    ProduitRepository repo;
    @Override
    public Produit addCandidat(Produit c) {
        return repo.save(c);
    }

    @Override
    public List<Produit> getCandidats() {
        return repo.findAll();
    }

    @Override
    public Produit getById(int id) {
        return repo.findById(id).get();
    }

}



