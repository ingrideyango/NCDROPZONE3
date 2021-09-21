import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AvionComponent } from './avion/avion.component';
import { ParachuteComponent } from './parachute/parachute.component';
import { ParachutisteComponent } from './parachutiste/parachutiste.component';
import { PiloteComponent } from './pilote/pilote.component';
import { SautComponent } from './saut/saut.component';
import { VolComponent } from './vol/vol.component';

const routes: Routes = [
  {path:'',component: AppComponent},
  {path:'avion',component: AvionComponent},
  {path:'parachute',component: ParachuteComponent},
  {path:'parachutiste',component: ParachutisteComponent},
  {path:'pilote',component: PiloteComponent},
  {path:'saut',component: SautComponent},
  {path:'vol',component: VolComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
