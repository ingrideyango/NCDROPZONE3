package fr.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.projet.api.Views;

@Entity
@Table(name="avion")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AVION_ID")
    @JsonView(Views.Commons.class)
    private int id;
    
    @Column(name = "AVION_NOM", length = 100, nullable = false)
    @JsonView(Views.Avion.class)
    private String nom;

    @Column(name = "AVION_CAPACITE")
    @JsonView(Views.Avion.class)
    private int capacite;

    @Column(name = "AVION_ESTDISPONIBLE")
    @JsonView(Views.Avion.class)
    private boolean estDisponible;

    @Column(name = "AVION_NBROTATIONMAX")
    @JsonView(Views.Avion.class)
    private int nbRotationMax;

    @OneToOne
    @JoinColumn(name = "AVION_PILOTE")
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