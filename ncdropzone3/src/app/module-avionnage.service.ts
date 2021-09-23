import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ModuleAvionnageService {

  private apiUrl : string = `${environment.apiUrl}/parachutiste`;

  

  constructor(private http: HttpClient) { }

  findAllByNom(nom: string){
    return this.http.get(`${this.apiUrl}/by-nom/${nom}`)
  }

 
}
