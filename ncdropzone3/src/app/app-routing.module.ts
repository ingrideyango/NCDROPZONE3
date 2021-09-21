import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AvionComponent } from './avion/avion.component';
import { EcranAffichageComponent } from './ecran-affichage/ecran-affichage.component';
import { HomeComponent } from './home/home.component';
import { ModuleAvionnageComponent } from './module-avionnage/module-avionnage.component';
import { ModuleGestionComponent } from './module-gestion/module-gestion.component';
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
  {path:'moduleGestion',component: ModuleGestionComponent},
  {path:'moduleAvionnage',component: ModuleAvionnageComponent},
  {path:'ecranAffichage',component: EcranAffichageComponent},
  {path:'home',component: HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
