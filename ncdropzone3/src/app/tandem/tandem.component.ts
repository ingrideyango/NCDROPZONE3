import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ParachutisteService } from '../parachutiste.service';
import { TandemService } from '../tandem.service';

@Component({
  selector: 'app-tandem',
  templateUrl: './tandem.component.html',
  styleUrls: ['./tandem.component.css']
})
export class TandemComponent implements OnInit {

  constructor(private srvTandem: TandemService, private srvParachutiste: ParachutisteService) { }

  ngOnInit(): void {
  }

  tandems: any = this.srvTandem.findAll();
  parachutistes: any = this.srvParachutiste.findAll();
  parachutistesRechercheInstructeur: any = new Observable();
  parachutistesRechercheVideoman: any = new Observable();

  formTandem: any = {
    nom: "",
    prenom: "",
    nomInstructeur: "",
    prenomInstructeur: "",
    nomVideoman: "",
    prenomVideoman: ""
  }
  parachutiste: any = {};

  refresh = () => {
    this.parachutistes = this.srvParachutiste.findAll();
    this.tandems = this.srvTandem.findAll();
  }
  formTandemClean = () => this.formTandem = {
    nom: "",
    prenom: "",
    nomInstructeur: "",
    prenomInstructeur: "",
    nomVideoman: "",
    prenomVideoman: ""
  };

  afficherParachutisteNomInstructeur(){
    this.parachutistesRechercheInstructeur = this.srvTandem.findAllByNom(this.formTandem.nomInstructeur);
  }

  afficherParachutisteNomVideoman(){
    this.parachutistesRechercheVideoman = this.srvTandem.findAllByNom(this.formTandem.nomVideoman);
  }

  ajouterTandem(){
    this.srvTandem.add(this.formTandem).subscribe(this.refresh);
    this.formTandemClean();
  }

  supprimerTandem(tandem: any){
    this.srvTandem.delete(tandem).subscribe(this.refresh);
  }

  modifierTandem(){
    this.srvTandem.update(this.formTandem).subscribe(this.refresh);
    this.formTandemClean();
  }

  editerTandem(tandem: any){
    this.formTandem = tandem;
  }

}
