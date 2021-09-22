import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { AvionService } from '../avion.service';
import { ParachutisteService } from '../parachutiste.service';
import { PiloteService } from '../pilote.service';
import { VolService } from '../vol.service';

@Component({
  selector: 'app-vol',
  templateUrl: './vol.component.html',
  styleUrls: ['./vol.component.css']
})
export class VolComponent implements OnInit {

  formVol: any = {
    etatVol: "",
    avion: {
      nom: ""
    },
    pilote: {
      nom: ""
    },
    responsable: {
      nom: ""
    }
  }

  vols : any = [];
  avions : any = [];
  pilotes : any = [];
  parachutistes : any = [];

  constructor(private srvVol: VolService, private srvPilote: PiloteService, private srvParachutiste: ParachutisteService, private srvAvion: AvionService) {
    this.refresh();
  }

  ngOnInit(): void {
  }

  refresh = () => {
    this.vols = this.srvVol.findAll();
    this.avions = this.srvAvion.findAll();
    this.pilotes = this.srvPilote.findAll();
    this.parachutistes = this.srvParachutiste.findAll();
  }
  formVolClean = () => this.formVol = {
    etatVol: "",
    pilote: {
      nom: ""
    },
    responsable: {
      nom: ""
    }
  }

  ajouterVol() {
    this.srvVol.add(this.formVol).subscribe(this.refresh);
    this.formVolClean();
  }

  editerVol(vol: any) {
    this.formVol = vol;
  }

  modifierVol() {
    this.srvVol.update(this.formVol).subscribe(this.refresh);
    this.formVolClean();
  }

}
