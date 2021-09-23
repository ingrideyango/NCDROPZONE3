import { Component, OnInit } from '@angular/core';
import { ModuleAvionnageService } from '../module-avionnage.service';
import { ParachutisteService } from '../parachutiste.service';
import { TandemService } from '../tandem.service';
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
tandems: any = [];


  constructor(private srvVol: VolService, private srvAvionnage: ModuleAvionnageService, private srvTandem: TandemService  ) { 
    this.vols = this.srvVol.findAll();
    this.parachutistes = this.srvAvionnage.findAllAvionnage();
    this.tandems = this.srvTandem.findAll();
  
  }

  ngOnInit(): void {
  }



}
