import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ModuleAvionnageService {

  private apiUrl : string = `${environment.apiUrl}/parachutiste`;
  private apiUrlAvionnage : string = `${environment.apiUrl}/avionnage`;
  private apiUrlDispo : string = `${environment.apiUrl}/parachute`;

  

  constructor(private http: HttpClient) { }

  findAllByNom(nom: any){
    return this.http.get(`${this.apiUrl}/by-nom/${nom}`, nom)
  }

  findAllAvionnage(){
    return this.http.get(this.apiUrlAvionnage);
  }

  add(avionnage: any){
    return this.http.post(this.apiUrlAvionnage, avionnage);

  }

  findAllByEstDisponible(dispo: any){
    return this.http.get(`${this.apiUrlDispo}/by-dispo/${dispo}`,dispo);
  }

  update(avionnage: any){
    return this.http.put(this.apiUrlAvionnage, avionnage);
  }

  delete(avionnage: any) {
    return this.http.delete(`${ this.apiUrlAvionnage }/${ avionnage.id }`);
  }

}
