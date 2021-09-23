import { Component, OnInit } from '@angular/core';
import { ModuleAvionnageService } from '../module-avionnage.service';

@Component({
  selector: 'app-parachute-associe',
  templateUrl: './parachute-associe.component.html',
  styleUrls: ['./parachute-associe.component.css']
})
export class ParachuteAssocieComponent implements OnInit {

  constructor(srvModuleAvionnage : ModuleAvionnageService) { }

  ngOnInit(): void {
  }

}
