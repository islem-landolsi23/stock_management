package com.example.demo.service;

import com.example.demo.entity.Candidat;
import com.example.demo.entity.Commande;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICommandeService {
    public Commande addCommande(Commande c);
    public List<Commande> getCommande();
    public Commande getById(Long Id);
}
