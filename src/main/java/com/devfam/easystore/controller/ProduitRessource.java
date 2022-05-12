package com.devfam.easystore.controller;

import com.devfam.easystore.entities.Produit;
import com.devfam.easystore.service.ProduitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProduitRessource {

    private ProduitService produitService;

    private final Logger log= LoggerFactory.getLogger(ProduitRessource.class);

    public ProduitRessource( ProduitService produitService){
        this.produitService = produitService;
    }

    public ReponseENtity<Produit> addProduit(@RequestMapping Produit prduit){
        try {
            if(prduit.id != null){
                produitService.save(produit);
            }
        }
        catch(Exception e){
            e.getMessage()+"The produit is not saved proprely";
        }
    }

    @GetMapping("/produits")
    public ResponseEntity<List<Produit>> getAllProduits(Pageable pageable){
        log.debug("Request to get products");
        Page<Produit> page = produitService.allProduit(pageable);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

}
