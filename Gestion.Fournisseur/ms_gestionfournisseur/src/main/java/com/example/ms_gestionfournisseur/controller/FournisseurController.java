package com.example.ms_gestionfournisseur.controller;

import java.util.List;

import com.example.ms_gestionfournisseur.entities.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_gestionfournisseur.service.IFournisseurService;

@RestController
@RequestMapping("/Fournisseur")
public class FournisseurController {
	@Autowired
	IFournisseurService canService;
	@PostMapping("/AddFournisseur")
	public Fournisseur addFournisseur(@RequestBody Fournisseur c)
	{
		return canService.addFournisseur(c);
	}
	
	@GetMapping("/getOne/{id}")
	public Fournisseur getOne(@PathVariable("id") int id)
	{
		return canService.getById(id);
	}
	
	@GetMapping("/getAll")
	public List<Fournisseur> getAll(){
		return canService.getFournisseur();
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello Khaled";
	}
}
