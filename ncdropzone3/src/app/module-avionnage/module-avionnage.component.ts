import { Component, OnInit } from '@angular/core';
import { ModuleAvionnageService } from '../module-avionnage.service';
import { ParachutisteService } from '../parachutiste.service';

@Component({
  selector: 'app-module-avionnage',
  templateUrl: './module-avionnage.component.html',
  styleUrls: ['./module-avionnage.component.css']
})
export class ModuleAvionnageComponent implements OnInit {

  parachutistes: any = this.srvParachutiste.findAll();
  formParachutiste: any = {
    nom: "",
    prenom: "",
    parachute:"",
    hauteur: 0
  };
  parachutiste: any = {};  

  constructor(private srvParachutiste: ParachutisteService, private srvModuleAvionnage: ModuleAvionnageService) { }

  ngOnInit(): void {
  }


  // afficherParachutiste(parachutiste: any){
  //   this.parachutistes = this.srvModuleAvionnage.findAllByNom(parachutiste);
  // }
 

}
