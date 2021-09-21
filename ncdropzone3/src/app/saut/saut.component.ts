import { Component, OnInit } from '@angular/core';
import { SautService } from '../saut.service';

@Component({
  selector: 'app-saut',
  templateUrl: './saut.component.html',
  styleUrls: ['./saut.component.css']
})
export class SautComponent implements OnInit {

  formSaut: any = {
    hauteur: 0
  };

  sauts: any = [];

  constructor(private srvSaut: SautService) {
    this.refresh();
  }

  ngOnInit(): void {
  }

  refresh = () => this.sauts = this.srvSaut.findAll();
  formSautClean = () => this.formSaut = {
    hauteur: 0
  };

  ajouterSaut() {
    this.srvSaut.add(this.formSaut).subscribe(this.refresh);
    this.formSautClean();
  }

  supprimerSaut(saut: any) {
    this.srvSaut.delete(saut).subscribe(this.refresh);
  }

  editerSaut(saut: any) {
    this.formSaut = saut;
  }

  modifierSaut() {
    this.srvSaut.update(this.formSaut).subscribe(this.refresh);
    this.formSautClean();
  }

}
