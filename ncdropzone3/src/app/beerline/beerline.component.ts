import { Component, OnInit } from '@angular/core';
import { BeerlineService } from '../beerline.service';
import { ParachuteService } from '../parachute.service';
import { VolService } from '../vol.service';

@Component({
  selector: 'app-beerline',
  templateUrl: './beerline.component.html',
  styleUrls: ['./beerline.component.css']
})
export class BeerlineComponent implements OnInit {
  formVol: any = {
    etatVol: ""
  }

  vols : any = [];
  constructor(private srvBeerline : BeerlineService) { 
  this.refresh();
}

  ngOnInit(): void { }

  refresh = () => this.vols = this.srvBeerline.findAll();
  

 

}
