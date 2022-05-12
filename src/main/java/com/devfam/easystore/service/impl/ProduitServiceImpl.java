package com.devfam.easystore.service.impl;

import com.devfam.easystore.repositories.ProduitRepository;
import com.devfam.easystore.service.ProduitService;
import com.devfam.easystore.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService{
    private ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository){
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit addProduit(Produit produit) {
       if(produitRepository.findById(produit.getId()).isPresent()){
           produitRepository.save(produit);
       }
        return produit;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Produit> allProduit(Pageable p) {

        return produitRepository.findAll(p);
    }

    @Override
    public Produit upadateProduit(Long id, Produit p) {
        Produit produit = produitRepository.findById(id).get();
        if(produit != null){

            produit.setPrix(p.getPrix());
            produit.setIntitule(p.getIntitule());
            produit.setMarque(p.getMarque());
            produit.setImageName(p.getImageName());
            produit.setImage(p.getImage());
            produit.setCategory(p.getCategory());
            produit.setAvailable(p.isAvailable());
            produit.setSelected(p.isSelected());
            produitRepository.save(produit);
        }
        return produit;
    }
}
