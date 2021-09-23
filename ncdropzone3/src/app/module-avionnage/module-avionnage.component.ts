import { Component, OnInit } from '@angular/core';
import { ModuleAvionnageService } from '../module-avionnage.service';
import { ParachuteService } from '../parachute.service';
import { ParachutisteService } from '../parachutiste.service';
import { SautService } from '../saut.service';

@Component({
  selector: 'app-module-avionnage',
  templateUrl: './module-avionnage.component.html',
  styleUrls: ['./module-avionnage.component.css']
})
export class ModuleAvionnageComponent implements OnInit {

  parachutistes: any = this.srvParachutiste.findAll();
  parachutes: any = this.srvParachute.findAll();
  sauts: any = this.srvSaut.findAll();
  parachutistesRecherche: any = [];

  formParachutiste: any = {
    nom: "",
    parachute: "",
    saut: 0
  };

  
   

  constructor(private srvParachutiste: ParachutisteService, private srvParachute: ParachuteService, private srvSaut: SautService, private srvModuleAvionnage: ModuleAvionnageService) { }

  ngOnInit(): void {
  }

  afficherParachutisteNom(nom: string){

    nom = this.formParachutiste.nom;
    this.parachutistesRecherche = this.srvModuleAvionnage.findAllByNom(nom);

  }

}
