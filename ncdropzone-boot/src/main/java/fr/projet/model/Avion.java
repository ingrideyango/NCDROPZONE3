package fr.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AVION_ID")
    private int id;
    
    @Column(name = "AVION_NOM", length = 100, nullable = false)
    private String nom;

    @Column(name = "AVION_CAPACITE")
    private int capacite;

    @Column(name = "AVION_ESTDISPONIBLE")
    private boolean estDisponible;

    @Column(name = "AVION_NBROTATIONMAX")
    private int nbRotationMax;

    private Pilote pilote;

    public Avion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    public int getNbRotationMax() {
        return nbRotationMax;
    }

    public void setNbRotationMax(int nbRotationMax) {
        this.nbRotationMax = nbRotationMax;
    }


    
}