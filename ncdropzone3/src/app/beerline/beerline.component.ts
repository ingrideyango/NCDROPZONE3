import { Component, OnInit } from '@angular/core';
import { BeerlineService } from '../beerline.service';
import { ParachutisteService } from '../parachutiste.service';

@Component({
  selector: 'app-beerline',
  templateUrl: './beerline.component.html',
  styleUrls: ['./beerline.component.css']
})
export class BeerlineComponent implements OnInit {
  parachutistes: any = this.srvParachutiste.findAll();
  parachutiste:any={};
  formParachutiste: any = {
    nom: "",
    prenom: "",
    numeroLicence: "",
    dateLicence: "",
    isBeerLined:false
  }
  constructor( private srvParachutiste : ParachutisteService) { 
  this.refresh;
}

  ngOnInit(): void { }

  refresh = () => this.parachutistes = this.srvParachutiste.findAll();
  formParachutisteClean = () => this.formParachutiste = {
    nom: "",
    prenom: "",
    numeroLicence: "",
    dateLicence: ""
  };

 ajouterRetirerBeerLine(){
   this.srvParachutiste.update(this.formParachutiste).subscribe(this.refresh);
   this.formParachutisteClean();
 }
 editerParachutiste(parachutiste: any){
    this.formParachutiste = parachutiste;
  }
}
