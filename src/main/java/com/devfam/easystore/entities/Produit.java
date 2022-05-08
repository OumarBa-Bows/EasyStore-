package com.devfam.easystore.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
@Getter @Setter @NoArgsConstructor
public class Produit {
    @Id @GeneratedValue
    private Long id;
    private String intitule;
    private String marque;
    private Double prix;

    public Produit( String intitule, String marque, Double prix){
        this.intitule = intitule;
        this.marque = marque;
        this.prix = prix;
    }
}
