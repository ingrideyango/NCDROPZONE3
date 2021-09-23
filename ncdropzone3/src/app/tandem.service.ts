import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TandemService {

  private apiUrl : string = `${environment.apiUrl}/tandem`;

  private apiUrlParachutiste : string = `${environment.apiUrl}/parachutiste`;

  constructor(private http: HttpClient) { }

  findAll(){
    return this.http.get(this.apiUrl);
  }

  findAllByNom(nom: any){
    return this.http.get(`${this.apiUrlParachutiste}/by-nom/${nom}`, nom)
  }

  add(tandem: any){
    return this.http.post(this.apiUrl, tandem);
  }

  update(tandem: any){
    return this.http.put(`${this.apiUrl}/${tandem.id}`, tandem);
  }

  delete(tandem: any){
    return this.http.delete(`${this.apiUrl}/${tandem.id}`);
  }
}
