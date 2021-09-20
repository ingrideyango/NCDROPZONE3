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

@Entity
@Table(name = "parachustiste")
public class Parachutiste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PARACHUTISTE_ID")
	private int id;
	
	@Column(name = "PARACHUTISTE_NOM", nullable = false)
	private String nom;
	
	@Column(name = "PARACHUTISTE_PRENOM", nullable = false)
	private String prenom;
	
	@Column(name = "PARACHUTISTE_NUMEROLICENCE", nullable = false)
	private String numeroLicence;
	
	@Column(name = "PARACHUTISTE_DATELICENCE", nullable = false)
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

	public Parachutiste() {
		super();
	}	

}
