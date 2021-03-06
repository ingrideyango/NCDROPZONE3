package fr.projet.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.projet.api.Views;

@Entity
@Table(name = "parachute")
public class Parachute {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PARACHUTE_ID")
    @JsonView(Views.Commons.class)
    private int id;

    @Column(name = "PARACHUTE_NOMHARNAIS", length = 100, nullable = false)
    @JsonView(Views.Parachute.class)
    private String nomHarnais;
    @Column(name="PARACHUTE_TYPESECURITE")
    @JsonView(Views.Parachute.class)
    private String typeSecurite;

    @Column(name = "PARACHUTE_NOMVOILEPRINCIPALE", length = 100, nullable = false)
    @JsonView(Views.Parachute.class)
    private String nomVoilePrincipale;

    @Column(name = "PARACHUTE_NOMVOILESECOURS", length = 100, nullable = false)
    @JsonView(Views.Parachute.class)
    private String nomVoileSecours;

    @Column(name = "PARACHUTE_TAILLEVOILEPRINCIPALE", nullable = false)
    @JsonView(Views.Parachute.class)
    private double tailleVoilePrincipale;

    @Column(name = "PARACHUTE_TAILLEVOILESECOURS", nullable = false)
    @JsonView(Views.Parachute.class)
    private double tailleVoileSecours;

    @Column(name = "PARACHUTE_DATEPLIAGEVOILESECOURS", nullable = false)
    @JsonView(Views.Parachute.class)
    private LocalDate datePliageVoileSecours;

    @Column(name = "PARACHUTE_ESTPERSONNEL", nullable = false)
    @JsonView(Views.Parachute.class)
    private boolean estPersonnel;

    @Column(name = "PARACHUTE_ESTDISPONIBLE", nullable = true)
    @JsonView(Views.Parachute.class)
    private boolean estDisponible;
    
    @ManyToOne
    @JoinColumn(name = "PARACHUTE_PARACHUTISTE")
    private Parachutiste parachutiste;

    

    public Parachute() {
    }
    public Parachute(String nomHarnais, String typeSecurite, String nomVoilePrincipale, String nomVoileSecours,
            double tailleVoilePrincipale, double tailleVoileSecours, LocalDate datePliageVoileSecours,
            boolean estPersonnel, boolean estDisponible) {
        this.nomHarnais = nomHarnais;
        this.typeSecurite = typeSecurite;
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

    public String getTypeSecurite() {
        return typeSecurite;
    }

    public void setTypeSecurite(String typeSecurite) {
        this.typeSecurite = typeSecurite;
    }

    public Parachutiste getParachutiste() {
        return parachutiste;
    }

    public void setParachutiste(Parachutiste parachutiste) {
        this.parachutiste = parachutiste;
    }

    

}
