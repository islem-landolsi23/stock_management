package com.example.demo.controller;

import com.example.demo.entity.Commande;
import com.example.demo.repository.ICommandeRepository;
import com.example.demo.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/API/GestionCommande")
public class CommandeController {
    @Autowired
    ICommandeService commandeService;

    @GetMapping("/getAll")
    public List<Commande> getAll(){
        return commandeService.getCommande();
    }

    @PostMapping("/addCommande")
    public Commande addCommande(@RequestBody Commande c){
        return commandeService.addCommande(c);
    }

    @GetMapping("/world")
    public String HelloWorld(){
        return "Hello World";
    }
}

