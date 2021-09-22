import { Component, OnInit } from '@angular/core';
import { ParachuteService } from '../parachute.service';

@Component({
  selector: 'app-parachute',
  templateUrl: './parachute.component.html',
  styleUrls: ['./parachute.component.css']
})
export class ParachuteComponent implements OnInit {

  parachutes: any = this.srvParachute.findAll();

  formParachute: any = { 
    nomHarnais: "", 
    typeSecurite:"",
    nomVoilePrincipale: "",
    nomVoileSecours: "",
    tailleVoilePrincipale: 0,
    tailleVoileSecours: 0,
    datePliageVoileSecours: "",
    estPersonnel: false,
    estDisponible: true
  }

  constructor(private srvParachute: ParachuteService) { }

  ngOnInit(): void {
  }

  refresh = () => this.parachutes = this.srvParachute.findAll();

  ajouterParachute() {
    this.srvParachute.add(this.formParachute).subscribe(this.refresh);
    this.formParachute = { 
      nomHarnais: "", 
      typeSecurite:"",
      nomVoilePrincipale: "",
      nomVoileSecours: "",
      tailleVoilePrincipale: 0,
      tailleVoileSecours: 0,
      datePliageVoileSecours: "",
      estPersonnel: false,
      estDisponible: true
    }
  }

  editerParachute(parachute: any) {
    this.formParachute = parachute;
  }

  modifierParachute() {
    this.srvParachute.update(this.formParachute).subscribe(this.refresh);
    this.formParachute = { 
      nomHarnais: "", 
      typeSecurite:"",
      nomVoilePrincipale: "",
      nomVoileSecours: "",
      tailleVoilePrincipale: 0,
      tailleVoileSecours: 0,
      datePliageVoileSecours: "",
      estPersonnel: false,
      estDisponible: true
    }
  }

  supprimerParachute(parachute: any) {
    this.srvParachute.delete(parachute).subscribe(this.refresh);
  }
}
