package fr.projet.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "saut")
public class Saut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SAUT_ID")
    private int id;

    @Column(name = "SAUT_HAUTEUR")
    private int hauteur;

    private Vol vol;
    private List<Parachutiste> parachutistes;
}
