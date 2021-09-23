import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { AvionService } from '../avion.service';
import { ParachutisteService } from '../parachutiste.service';
import { PiloteService } from '../pilote.service';
import { TandemService } from '../tandem.service';
import { VolService } from '../vol.service';
import { ModuleAvionnageService } from '../module-avionnage.service';

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

  avionnages : any = [];
  tandems : any = [];

  constructor(private srvVol: VolService, private srvPilote: PiloteService,
     private srvParachutiste: ParachutisteService, private srvAvion: AvionService,
      private srvTandem: TandemService, private srvAvionnage: ModuleAvionnageService) {
    this.refresh();
  }

  ngOnInit(): void {
  }

  refresh = () => {
    this.vols = this.srvVol.findAll();
    this.avions = this.srvAvion.findAll();
    this.pilotes = this.srvPilote.findAll();
    this.parachutistes = this.srvParachutiste.findAll();
    this.tandems = this.srvTandem.findAll();
    this.avionnages = this.srvAvionnage.findAllAvionnage();
  }
  formVolClean = () => this.formVol = {
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

  supprimerAvionnage(avionnage: any){
    this.srvAvionnage.delete(avionnage).subscribe(this.refresh);
  }

  editerAvionnage(avionnage: any){
    this.srvAvionnage.update(avionnage).subscribe(this.refresh);
  }

  supprimerTandem(tandem: any){
    this.srvTandem.delete(tandem).subscribe(this.refresh);
  }

  editerTandem(tandem: any){
    this.srvTandem.update(tandem).subscribe(this.refresh);
  }

}
