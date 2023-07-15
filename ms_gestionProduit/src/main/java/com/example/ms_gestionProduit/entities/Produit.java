package com.example.ms_gestionProduit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idProduit;
    private String nomProduit;
    private float prixProduit;
    private int stockProduit;
    private int category ;

    public Produit ( String nomProduit, int idProduit , int stockProduit , float prixProduit ,
                     int category){
        this.nomProduit=nomProduit;
        this.idProduit=idProduit;
        this.stockProduit=stockProduit;
        this.prixProduit=prixProduit;
        this.category=category ;
    }

}