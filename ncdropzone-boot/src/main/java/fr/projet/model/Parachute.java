package fr.projet.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parachute")
public class Parachute {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parachute_id")
    private int id;

    @Column(name = "parachute_nonHarnais", length = 100, nullable = false)
    private String nomHarnais;

    @Column(name = "parachute_nomVoilePrincipale", length = 100, nullable = false)
    private String nomVoilePrincipale;

    @Column(name = "parachute_nomVoileSecours", length = 100, nullable = false)
    private String nomVoileSecours;

    @Column(name = "parachute_tailleVoilePrincipale", nullable = false)
    private double tailleVoilePrincipale;

    @Column(name = "parachute_tailleVoileSecours", nullable = false)
    private double tailleVoileSecours;

    @Column(name = "parachute_datePliageVoileSecours", nullable = false)
    private LocalDate datePliageVoileSecours;

    @Column(name = "parachute_estPersonnel", nullable = false)
    private boolean estPersonnel;

    @Column(name = "parachute_estDisponible", nullable = true)
    private boolean estDisponible;

    

    public Parachute() {
    }

    public Parachute(String nomHarnais, String nomVoilePrincipale, String nomVoileSecours, double tailleVoilePrincipale,
            double tailleVoileSecours, LocalDate datePliageVoileSecours, boolean estPersonnel, boolean estDisponible) {
        this.nomHarnais = nomHarnais;
        this.nomVoilePrincipale = nomVoilePrincipale;
        this.nomVoileSecours = nomVoileSecours;
        this.tailleVoilePrincipale = tailleVoilePrincipale;
        this.tailleVoileSecours = tailleVoileSecours;
        this.datePliageVoileSecours = datePliageVoileSecours;
        this.estPersonnel = estPersonnel;
        this.estDisponible = estDisponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomHarnais() {
        return nomHarnais;
    }

    public void setNomHarnais(String nomHarnais) {
        this.nomHarnais = nomHarnais;
    }

    public String getNomVoilePrincipale() {
        return nomVoilePrincipale;
    }

    public void setNomVoilePrincipale(String nomVoilePrincipale) {
        this.nomVoilePrincipale = nomVoilePrincipale;
    }

    public String getNomVoileSecours() {
        return nomVoileSecours;
    }

    public void setNomVoileSecours(String nomVoileSecours) {
        this.nomVoileSecours = nomVoileSecours;
    }

    public double getTailleVoilePrincipale() {
        return tailleVoilePrincipale;
    }

    public void setTailleVoilePrincipale(double tailleVoilePrincipale) {
        this.tailleVoilePrincipale = tailleVoilePrincipale;
    }

    public double getTailleVoileSecours() {
        return tailleVoileSecours;
    }

    public void setTailleVoileSecours(double tailleVoileSecours) {
        this.tailleVoileSecours = tailleVoileSecours;
    }

    public LocalDate getDatePliageVoileSecours() {
        return datePliageVoileSecours;
    }

    public void setDatePliageVoileSecours(LocalDate datePliageVoileSecours) {
        this.datePliageVoileSecours = datePliageVoileSecours;
    }

    public boolean isEstPersonnel() {
        return estPersonnel;
    }

    public void setEstPersonnel(boolean estPersonnel) {
        this.estPersonnel = estPersonnel;
    }

    public boolean isEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    

}
