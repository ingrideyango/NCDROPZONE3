import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PiloteComponent } from './pilote/pilote.component';
import { ParachuteComponent } from './parachute/parachute.component';
import { ParachutisteComponent } from './parachutiste/parachutiste.component';
import { SautComponent } from './saut/saut.component';
import { VolComponent } from './vol/vol.component';
import { AvionComponent } from './avion/avion.component';

@NgModule({
  declarations: [
    AppComponent,
    PiloteComponent,
    ParachuteComponent,
    ParachutisteComponent,
    SautComponent,
    VolComponent,
    AvionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
