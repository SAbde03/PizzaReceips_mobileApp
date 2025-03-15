package com.example.pizzaapp.services;

import com.example.pizzaapp.DAO.IDAO;
import com.example.pizzaapp.Classes.Produit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDAO<Produit> {
    private List <Produit> produits;
    private static ProduitService instance;

    private ProduitService() {
        this.produits = new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if(instance == null)
            instance =  new ProduitService();
        return instance;
    }


    @Override
    public void create(Produit o) {
        produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public void delete(Produit o) {
        produits.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits){
            if(p.getId()==id)
                return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }
}
