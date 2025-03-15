package com.example.pizzaapp.Classes;

public class Produit {

    private int id ;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String dtaisIngred;
    private String description;
    private String preparation;
    private String duree;
    public static int comp;

   // public Produit(){}

    public Produit(String nom, int nbrIngredients, int photo, String duree,String dtaisIngred,String description,String preparation) {
        this.duree = duree;
        this.preparation = preparation;
        this.description = description;
        this.dtaisIngred = dtaisIngred;
        this.photo = photo;
        this.nbrIngredients = nbrIngredients;
        this.nom = nom;
        this.id = comp++;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDtaisIngred() {
        return dtaisIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public String getDuree() {
        return duree;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDtaisIngred(String dtaisIngred) {
        this.dtaisIngred = dtaisIngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", dtaisIngred='" + dtaisIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                ", duree=" + duree +
                '}';
    }
}
