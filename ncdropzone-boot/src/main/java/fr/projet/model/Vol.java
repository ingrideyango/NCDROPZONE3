package fr.projet.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vol")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOL_ID")
    private int id;

    @Column(name = "VOL_ETATVOL")
    private String etatVol;

    private Pilote pilote;
    private List<Saut> saut;
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
