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

@Entity
@Table(name = "vol")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOL_ID")
    private int id;

    @Column(name = "VOL_ETATVOL")
    private String etatVol;

    @OneToOne
    @JoinColumn(name = "VOL_PILOTE")
    private Pilote pilote;
    
    @OneToMany(mappedBy = "vol")
    private List<Saut> sauts;
    
    @OneToOne
    @JoinColumn(name = "VOL_RESPONSABLE")
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
