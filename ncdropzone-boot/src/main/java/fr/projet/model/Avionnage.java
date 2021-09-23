package fr.projet.model;

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
@Table(name="avionnage")
public class Avionnage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AVIONNAGE_ID")
	@JsonView(Views.Commons.class)
	private int id;
	
	@Column(name="AVIONNAGE_PARACHUTISTE_NOM")
	@JsonView(Views.Avionnage.class)
	private String nom;
	
	@Column(name="AVIONNAGE_PARACHUTISTE_PRENOM")
	@JsonView(Views.Avionnage.class)
	private String prenom;
	
	@Column(name="AVIONNAGE_PARACHUTE_NOM")
	@JsonView(Views.Avionnage.class)
	private String parachute;
	
	@Column(name="AVIONNAGE_SAUT_HAUTEUR")
	@JsonView(Views.Avionnage.class)
	private int saut;
	
	@ManyToOne
	@JoinColumn(name = "AVIONNAGE_VOL")
	@JsonView(Views.Avionnage.class)
	private Vol vol;
	

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
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

	public String getParachute() {
		return parachute;
	}

	public void setParachute(String parachute) {
		this.parachute = parachute;
	}

	public int getSaut() {
		return saut;
	}

	public void setSaut(int saut) {
		this.saut = saut;
	}
	
	

}
