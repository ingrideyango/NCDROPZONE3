package fr.projet.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parachustiste")
public class Parachutiste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parachutiste_id")
	private int id;
	
	@Column(name = "parachutiste_nom", nullable = false)
	private String nom;
	
	@Column(name = "parachutiste_prenom", nullable = false)
	private String prenom;
	
	@Column(name = "parachutiste_numeroLicence", nullable = false)
	private String numeroLicence;
	
	@Column(name = "parachutiste_dateLicence", nullable = false)
	private LocalDate dateLicence;

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

	public Parachutiste() {
		super();
	}	

}
