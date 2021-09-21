import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PiloteComponent } from './pilote/pilote.component';
import { ParachuteComponent } from './parachute/parachute.component';
import { ParachutisteComponent } from './parachutiste/parachutiste.component';
import { SautComponent } from './saut/saut.component';
import { VolComponent } from './vol/vol.component';
import { AvionComponent } from './avion/avion.component';
import { ModuleGestionComponent } from './module-gestion/module-gestion.component';
import { ModuleAvionnageComponent } from './module-avionnage/module-avionnage.component';
import { EcranAffichageComponent } from './ecran-affichage/ecran-affichage.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    PiloteComponent,
    ParachuteComponent,
    ParachutisteComponent,
    SautComponent,
    VolComponent,
    AvionComponent,
    ModuleGestionComponent,
    ModuleAvionnageComponent,
    EcranAffichageComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
