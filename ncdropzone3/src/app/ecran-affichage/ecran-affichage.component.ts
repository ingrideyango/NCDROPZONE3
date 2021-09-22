import { Component, OnInit } from '@angular/core';
import { AvionService } from '../avion.service';
import { ParachutisteService } from '../parachutiste.service';
import { VolService } from '../vol.service';

@Component({
  selector: 'app-ecran-affichage',
  templateUrl: './ecran-affichage.component.html',
  styleUrls: ['./ecran-affichage.component.css']
})
export class EcranAffichageComponent implements OnInit {
vols: any = [];
vol: any = {};
parachutistes: any = [];
parachutiste: any = {};
avions:any=[];
avion:any={}

  constructor(
    private srvVol: VolService,
    private srvParachutiste: ParachutisteService,
    private srvAvion :AvionService,
  ) { 
    this.vols = this.srvVol.findAll();
    this.parachutistes = this.srvParachutiste.findAll();
    this.avions=this.srvAvion.findAll();
  }

  ngOnInit(): void {
  }



}
