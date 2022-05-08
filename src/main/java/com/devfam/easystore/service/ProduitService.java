package com.devfam.easystore.service;

import com.devfam.easystore.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProduitService {

    //to add a new produit
    Produit addProduit(Produit p);

    /**
     * Get all the counters.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Produit> allProduit(Pageable pageable);
}