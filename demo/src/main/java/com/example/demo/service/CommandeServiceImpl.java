package com.example.demo.service;

import com.example.demo.entity.Commande;
import com.example.demo.repository.ICommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements ICommandeService {
    @Autowired ICommandeRepository commandeRepository;
    @Override
    public Commande addCommande(Commande c) {
        return commandeRepository.save(c);

    }

    @Override
    public List<Commande> getCommande() {
        return (List<Commande>) commandeRepository.findAll();
    }

    @Override
    public Commande getById(Long Id) {
        Commande c = commandeRepository.findById(Id).orElse(null);
        return commandeRepository.findById(Id).orElse(null);
    }
}
