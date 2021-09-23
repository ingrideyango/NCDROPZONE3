import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ModuleAvionnageService {

  private apiUrl : string = `${environment.apiUrl}/parachutiste`;
  private apiUrlAvionnage : string = `${environment.apiUrl}/avionnage`;

  

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

 
}
