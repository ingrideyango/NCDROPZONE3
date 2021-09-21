import { Component, OnInit } from '@angular/core';
import { VolService } from '../vol.service';

@Component({
  selector: 'app-vol',
  templateUrl: './vol.component.html',
  styleUrls: ['./vol.component.css']
})
export class VolComponent implements OnInit {

  formVol: any = {
    etatVol: ""
  }

  vols : any = [];

  constructor(private srvVol: VolService) {
    this.refresh();
  }

  ngOnInit(): void {
  }

  refresh = () => this.vols = this.srvVol.findAll();
  formVolClean = () => this.formVol = {
    etatVol: ""
  }

  ajouterVol() {
    this.srvVol.add(this.formVol).subscribe(this.refresh);
    this.formVolClean();
  }

  editerVol(vol: any) {
    this.formVol = vol;
  }

  modifierVol() {
    this.srvVol.update(this.formVol).subscribe(this.refresh);
    this.formVolClean();
  }

}
