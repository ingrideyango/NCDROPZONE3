import { Component, OnInit } from '@angular/core';
import { AvionService } from '../avion.service';

@Component({
  selector: 'app-avion',
  templateUrl: './avion.component.html',
  styleUrls: ['./avion.component.css']
})
export class AvionComponent implements OnInit {
  avions: any = [];
  avion: any = {};
  formAvion: any = {nom: "", capacite: 0, estDisponible: true};

  constructor(private srvAvion: AvionService) {

    this.refresh();
   }

   refresh = () => this.avions = this.srvAvion.findAll();

  ngOnInit(): void {
  }

  ajouterAvion() {
    this.srvAvion.add(this.formAvion).subscribe(this.refresh);
    this.formAvion = {nom: "", capacite: 0, estDisponible: true};
  }

  modifierAvion() {
    this.srvAvion.update(this.formAvion).subscribe(this.refresh);
    this.formAvion = {nom: "", capacite: 0, estDisponible: true};
  }

  editerAvion(avion: any) {
    this.formAvion = avion;
  }

  supprimerAvion(avion: any) {
    this.srvAvion.delete(avion).subscribe(this.refresh);
  }
}
