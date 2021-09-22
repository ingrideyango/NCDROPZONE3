import { Component, OnInit } from '@angular/core';
import { ParachuteService } from '../parachute.service';
import { ParachutisteService } from '../parachutiste.service';
import { SautService } from '../saut.service';

@Component({
  selector: 'app-module-avionnage',
  templateUrl: './module-avionnage.component.html',
  styleUrls: ['./module-avionnage.component.css']
})
export class ModuleAvionnageComponent implements OnInit {

  parachutistes: any = this.srvParachutiste.findAll();
  formParachutiste: any = {
    saut: ""
  };
  parachutiste: any = {};
  parachutes: any = this.srvParachute.findAll();
  sauts: any = this.srvSaut.findAll();
  checkSaut : boolean = false;
  hauteur : number = 0;  

  constructor(private srvParachutiste: ParachutisteService, private srvParachute: ParachuteService, private srvSaut: SautService) { }

  ngOnInit(): void {
  }


  validerSaut(){
    // this.parachutistes.forEach(parachutiste => {
    //   if(this.checkSaut == true){
    //     this.formParachutiste.saut = 1;
    //     this.srvParachutiste.update(this.formParachutiste).subscribe();
    //   }
    // });
   }
}
