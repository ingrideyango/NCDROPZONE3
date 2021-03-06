package fr.projet.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.projet.api.Views;

@Entity
@Table(name = "saut")
public class Saut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SAUT_ID")
    @JsonView(Views.Commons.class)
    private int id;

    @Column(name = "SAUT_HAUTEUR")
    @JsonView(Views.Saut.class)
    private int hauteur;

    @ManyToOne
    @JoinColumn(name = "SAUT_VOL")
    private Vol vol;
    
    @OneToMany(mappedBy = "saut")
    private List<Parachutiste> parachutistes;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHauteur() {
        return hauteur;
    }
    
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    public Saut() {
    }
}
