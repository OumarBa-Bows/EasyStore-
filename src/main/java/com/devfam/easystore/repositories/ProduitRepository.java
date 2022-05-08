package com.devfam.easystore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devfam.easystore.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

    Page<Produit> findAll(Pageable var1);
}
