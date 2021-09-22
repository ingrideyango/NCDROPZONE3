import { Component, OnInit } from '@angular/core';
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


  constructor(
    private srvVol: VolService,
    private srvParachutiste: ParachutisteService,
  
  ) { 
    this.vols = this.srvVol.findAll();
    this.parachutistes = this.srvParachutiste.findAll();
  
  }

  ngOnInit(): void {
  }



}
