import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ParachutisteService {

  private apiUrl : string = `${environment.apiUrl}/parachutiste`

  constructor(private http: HttpClient) { }

  findAll(){
    return this.http.get(this.apiUrl);
  }

  add(parachutiste: any){
    return this.http.post(this.apiUrl, parachutiste);
  }

  update(parachutiste: any){
    return this.http.put(`${this.apiUrl}/${parachutiste.id}`, parachutiste);
  }

  delete(parachutiste: any){
    return this.http.delete(`${this.apiUrl}/${parachutiste.id}`);
  }
}
