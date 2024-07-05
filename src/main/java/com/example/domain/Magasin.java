package com.example.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "magasin")
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMagasin;
    String nom;
    String localisation;
    Date ouverture;

    public Magasin() {
    }

    public int getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(int idMagasin) {
        this.idMagasin = idMagasin;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getOuverture() {
        return ouverture;
    }

    public void setOuverture(Date ouverture) {
        this.ouverture = ouverture;
    }
}
