package fr.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.projet.api.Views;

@Entity
@Table(name = "tandem")
public class Tandem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TANDEM_ID")
	@JsonView(Views.Commons.class)
	private int id;
	
	@Column(name = "TANDEM_NOM", nullable = false)
	@JsonView(Views.Tandem.class)
	private String nom;
	
	@Column(name = "TANDEM_PRENOM", nullable = false)
	@JsonView(Views.Tandem.class)
	private String prenom;

	@Column(name = "TANDEM_INSTRUCTEUR_NOM", nullable = false)
	@JsonView(Views.Tandem.class)
    private String nomInstructeur;

	@Column(name = "TANDEM_INSTRUCTEUR_PRENOM", nullable = false)
	@JsonView(Views.Tandem.class)
    private String prenomInstructeur;

	@Column(name = "TANDEM_VIDEOMAN_NOM")
	@JsonView(Views.Tandem.class)
    private String nomVideoman;

	@Column(name = "TANDEM_VIDEOMAN_PRENOM")
	@JsonView(Views.Tandem.class)
    private String prenomVideoman;

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

    public String getNomInstructeur() {
		return nomInstructeur;
	}

	public void setNomInstructeur(String nomInstructeur) {
		this.nomInstructeur = nomInstructeur;
	}

	public String getPrenomInstructeur() {
		return prenomInstructeur;
	}

	public void setPrenomInstructeur(String prenomInstructeur) {
		this.prenomInstructeur = prenomInstructeur;
	}

	public String getNomVideoman() {
		return nomVideoman;
	}

	public void setNomVideoman(String nomVideoman) {
		this.nomVideoman = nomVideoman;
	}

	public String getPrenomVideoman() {
		return prenomVideoman;
	}

	public void setPrenomVideoman(String prenomVideoman) {
		this.prenomVideoman = prenomVideoman;
	}

	public Tandem() {
	}	

}
