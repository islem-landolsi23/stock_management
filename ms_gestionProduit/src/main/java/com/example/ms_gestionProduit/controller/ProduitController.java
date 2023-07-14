package com.example.ms_gestionProduit.controller;

import java.util.List;

import com.example.ms_gestionProduit.entities.Produit;
import com.example.ms_gestionProduit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Produit")
public class ProduitController {
    @Autowired
    ProduitService canService;
    @PostMapping("/AddProduit")
    public Produit addCandidat(@RequestBody Produit c)
    {
        return canService.addCandidat(c);
    }

    @GetMapping("/getOne/{id}")
    public Produit getOne(@PathVariable("id") int idProduit)
    {
        return canService.getById(idProduit);
    }

    @GetMapping("/getAll")
    public List<Produit> getAll(){
        return canService.getCandidats();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello boubaker";
    }
}





