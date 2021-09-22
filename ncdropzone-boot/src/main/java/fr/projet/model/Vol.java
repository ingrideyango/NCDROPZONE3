package fr.projet.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.projet.api.Views;

@Entity
@Table(name = "vol")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOL_ID")
	@JsonView(Views.Commons.class)
    private int id;

    @Column(name = "VOL_ETATVOL")
	@JsonView(Views.Vol.class)
    private String etatVol;

    @OneToOne
    @JoinColumn(name = "VOL_AVION")
    @JsonView(Views.Vol.class)
    private Avion avion;

    @OneToOne
    @JoinColumn(name = "VOL_PILOTE")
    @JsonView(Views.Vol.class)
    private Pilote pilote;
    
    @OneToMany(mappedBy = "vol")
    private List<Saut> sauts;
    
    @OneToOne
    @JoinColumn(name = "VOL_RESPONSABLE")
    @JsonView(Views.Vol.class)
    private Parachutiste responsable;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEtatVol() {
        return etatVol;
    }
    public void setEtatVol(String etatVol) {
        this.etatVol = etatVol;
    }
    
    public Vol() {
    }
}
