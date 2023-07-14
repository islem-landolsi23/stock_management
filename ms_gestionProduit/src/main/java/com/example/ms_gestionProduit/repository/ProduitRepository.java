package com.example.ms_gestionProduit.repository;

import com.example.ms_gestionProduit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer>{

}







