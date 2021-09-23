import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
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
  parachutes: any = this.srvModuleAvionnage.findAllByEstDisponible(true);
  sauts: any = this.srvSaut.findAll();
  parachutistesRecherche: any = new Observable();

  formAvionnage: any = {
    nom: "",
    prenom: "",
    parachute: "",
    saut: 0
  };

  
   

  constructor(private srvParachutiste: ParachutisteService, private srvParachute: ParachuteService, private srvSaut: SautService, private srvModuleAvionnage: ModuleAvionnageService) { }

  ngOnInit(): void {
  }

  afficherParachutisteNom(){

   
    this.parachutistesRecherche = this.srvModuleAvionnage.findAllByNom(this.formAvionnage.nom);

  }

  ajouterParachutisteAvionnage(){
    this.srvModuleAvionnage.add(this.formAvionnage).subscribe();
  }

}
