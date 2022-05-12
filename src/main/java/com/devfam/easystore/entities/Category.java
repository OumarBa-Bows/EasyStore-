package com.devfam.easystore.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Category implements Serializable {
    @Id  @GeneratedValue
    private Long id;
    private String nom;
    private String descriptif;

    @OneToMany(mappedBy = "category")
    private Set<Produit> produits = new HashSet<>();
}
