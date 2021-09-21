import { Component, OnInit } from '@angular/core';
import { PiloteService } from '../pilote.service';

@Component({
  selector: 'app-pilote',
  templateUrl: './pilote.component.html',
  styleUrls: ['./pilote.component.css']
})
export class PiloteComponent implements OnInit {
pilotes:any=[];
formPilote:any={nom:"",prenom:"",numeroLicence:""};
  constructor(private srvPilote:PiloteService) { 
this.refresh();
  }
  refresh=() => this.pilotes=this.srvPilote.findAll();
  ngOnInit(): void {}

  ajouterPilote(){
    this.srvPilote.add(this.formPilote).subscribe(this.refresh);
  }
  supprimerPilote(pilote:any){
    this.srvPilote.delete(pilote).subscribe(this.refresh);
  }
  editerPilote(pilote:any){
    this.formPilote=pilote;
  }
  modifierPilote(){
    this.srvPilote.update(this.formPilote).subscribe(this.refresh);
  }
}
