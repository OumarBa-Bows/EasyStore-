package com.devfam.easystore.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Panier implements Serializable {
    @Id @GeneratedValue
    private Long id;
}
