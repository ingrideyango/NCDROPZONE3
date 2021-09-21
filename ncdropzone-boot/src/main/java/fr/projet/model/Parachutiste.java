package fr.projet.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.projet.api.Views;

@Entity
@Table(name = "parachustiste")
public class Parachutiste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PARACHUTISTE_ID")
	@JsonView(Views.Commons.class)
	private int id;
	
	@Column(name = "PARACHUTISTE_NOM", nullable = false)
	@JsonView(Views.Parachutiste.class)
	private String nom;
	
	@Column(name = "PARACHUTISTE_PRENOM", nullable = false)
	@JsonView(Views.Parachutiste.class)
	private String prenom;
	
	@Column(name = "PARACHUTISTE_NUMEROLICENCE", nullable = false)
	@JsonView(Views.Parachutiste.class)
	private String numeroLicence;

	@Column(name="PARACHUTISTE_BEERLINE",nullable = false)
	@JsonView(Views.Parachutiste.class)
	private boolean isBeerLined;
	
	@Column(name = "PARACHUTISTE_DATELICENCE", nullable = false)
	@JsonView(Views.Parachutiste.class)
	private LocalDate dateLicence;
	
	@OneToMany(mappedBy = "parachutiste")
	private List<Parachute> parachutes; 
	
	@ManyToOne
	@JoinColumn(name = "PARACHUTISTE_SAUT")
	private Saut saut; 
	
	@OneToOne(mappedBy = "responsable")
	private Vol vol;

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

	public LocalDate getDateLicence() {
		return dateLicence;
	}

	public void setDateLicence(LocalDate dateLicence) {
		this.dateLicence = dateLicence;
	}

	public boolean isBeerLined() {
		return isBeerLined;
	}

	public void setBeerLined(boolean isBeerLined) {
		this.isBeerLined = isBeerLined;
	}

	public List<Parachute> getParachutes() {
		return parachutes;
	}

	public void setParachutes(List<Parachute> parachutes) {
		this.parachutes = parachutes;
	}

	public Saut getSaut() {
		return saut;
	}

	public void setSaut(Saut saut) {
		this.saut = saut;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Parachutiste() {
		super();
	}	

}
