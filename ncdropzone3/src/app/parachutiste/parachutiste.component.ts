import { Component, OnInit } from '@angular/core';
import { ParachutisteService } from '../parachutiste.service';


@Component({
  selector: 'app-parachutiste',
  templateUrl: './parachutiste.component.html',
  styleUrls: ['./parachutiste.component.css']
})
export class ParachutisteComponent implements OnInit {

  parachutistes: any = this.srvParachutiste.findAll();
  formParachutiste: any = {
    nom: "",
    prenom: "",
    numeroLicence: "",
    dateLicence: "",
    niveau:"",
  }
  parachutiste: any = {};

  constructor(private srvParachutiste: ParachutisteService) { }

  ngOnInit(): void {
  }
  

  refresh = () => this.parachutistes = this.srvParachutiste.findAll();
  formParachutisteClean = () => this.formParachutiste = {
    nom: "",
    prenom: "",
    numeroLicence: "",
    dateLicence: "",
    niveau:""
  };

  ajouterParachutiste(){
    this.srvParachutiste.add(this.formParachutiste).subscribe(this.refresh);
    this.formParachutisteClean();
  }

  supprimerParachutiste(parachutiste: any){
    this.srvParachutiste.delete(parachutiste).subscribe(this.refresh);
  }

  modifierParachutiste(){
    this.srvParachutiste.update(this.formParachutiste).subscribe(this.refresh);
    this.formParachutisteClean();
  }

  editerParachutiste(parachutiste: any){
    this.formParachutiste = parachutiste;
  }

}
