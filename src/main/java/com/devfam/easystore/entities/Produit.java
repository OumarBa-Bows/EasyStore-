package com.devfam.easystore.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "produit")
@Data @NoArgsConstructor @AllArgsConstructor
public class Produit implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name ="intitule",nullable = false)
    private String intitule;
    private String marque;
    @Column(name ="prix",nullable = false)
    private Double prix;
    private String imageName;
    private byte[] image;
    private boolean selected;
    private boolean available;
    private boolean value;
    @ManyToOne
    private Category category;

}
