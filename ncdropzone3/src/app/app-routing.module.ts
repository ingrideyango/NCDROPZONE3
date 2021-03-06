import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AvionComponent } from './avion/avion.component';
import { BeerlineComponent } from './beerline/beerline.component';
import { EcranAffichageComponent } from './ecran-affichage/ecran-affichage.component';
import { HomeComponent } from './home/home.component';
import { ModuleAvionnageComponent } from './module-avionnage/module-avionnage.component';
import { ModuleGestionComponent } from './module-gestion/module-gestion.component';
import { ParachuteAssocieComponent } from './parachute-associe/parachute-associe.component';
import { ParachuteComponent } from './parachute/parachute.component';
import { ParachutisteComponent } from './parachutiste/parachutiste.component';
import { PiloteComponent } from './pilote/pilote.component';
import { SautComponent } from './saut/saut.component';
import { TandemComponent } from './tandem/tandem.component';
import { VolComponent } from './vol/vol.component';

const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'avion',component: AvionComponent},
  {path:'parachute',component: ParachuteComponent},
  {path:'parachutiste',component: ParachutisteComponent},
  {path:'pilote',component: PiloteComponent},
  {path:'saut',component: SautComponent},
  {path:'vol',component: VolComponent},
  {path:'moduleGestion',component: ModuleGestionComponent},
  {path:'moduleAvionnage',component: ModuleAvionnageComponent},
  {path:'ecranAffichage',component: EcranAffichageComponent},
  {path:'beerline',component: BeerlineComponent},
  {path:'tandem',component: TandemComponent},
  {path:'parachuteAssocie',component: ParachuteAssocieComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
