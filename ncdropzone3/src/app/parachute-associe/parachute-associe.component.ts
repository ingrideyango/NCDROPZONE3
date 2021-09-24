import { Component, OnInit } from '@angular/core';
import { ModuleAvionnageService } from '../module-avionnage.service';
import { ParachuteService } from '../parachute.service';
import { ParachutisteService } from '../parachutiste.service';

@Component({
  selector: 'app-parachute-associe',
  templateUrl: './parachute-associe.component.html',
  styleUrls: ['./parachute-associe.component.css']
})
export class ParachuteAssocieComponent implements OnInit {
parachutes: any = this.srvModuleAvionnage.findAllByEstDisponible(true);
parachute:any={};
parachutiste:any={};
parachutistes:any=this.srvParachutiste.findAll();
formAssociation: any = {
  parachutiste: {
    id: 0,
    nom:""
  },

}
formClean=()=> this.formAssociation={nom:""};

  constructor(private srvModuleAvionnage : ModuleAvionnageService,private srvParachutiste :ParachutisteService
    ,private srvParachute : ParachuteService) {}

  ngOnInit(): void {}
refresh =()=> this.parachutes=this.srvModuleAvionnage.findAllByEstDisponible(true);

associer(parachute:any){
this.srvParachute.associate(parachute, this.formAssociation.parachutiste).subscribe(this.refresh);
this.formClean()
}

}
