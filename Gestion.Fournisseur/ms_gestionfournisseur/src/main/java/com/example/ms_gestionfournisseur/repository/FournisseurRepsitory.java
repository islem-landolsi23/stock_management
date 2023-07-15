package com.example.ms_gestionfournisseur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ms_gestionfournisseur.entities.Fournisseur;

@Repository
public interface FournisseurRepsitory extends JpaRepository<Fournisseur, Integer>{

}
