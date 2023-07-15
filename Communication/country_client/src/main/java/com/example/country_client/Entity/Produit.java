package com.example.country_client.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {

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
