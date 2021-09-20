package fr.projet.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pilote")
public class Pilote {
    @Id
    @Column(name="pilote_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="pilote_nom",length = 50)
    private String nom;
    @Column(name ="pilote_prenom",length = 50)
    private String prenom;
    @Column(name="pilote_numero_licence",length=50)
    private String numeroLicence;
  
    private Avion avion;
    private Vol vol;
    
    public Pilote(String nom, String prenom, String numeroLicence) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroLicence = numeroLicence;
    }

    public Pilote() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(String numeroLicence) {
        this.numeroLicence = numeroLicence;
    }
    
    

    


}
