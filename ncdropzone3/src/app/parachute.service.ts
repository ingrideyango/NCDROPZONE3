import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ParachuteService {

  private apiUrl: string = `${ environment.apiUrl }/parachute`

  constructor(private http: HttpClient) { }

  findAll() {
    return this.http.get(this.apiUrl);
  }

  add(parachute: any) {
    return this.http.post(this.apiUrl, parachute);
  }

  update(parachute: any){
    return this.http.put(`${ this.apiUrl }/${ parachute.id }`, parachute);
  }

  delete(parachute: any) {
    return this.http.delete(`${ this.apiUrl }/${ parachute.id }`, parachute);
  }

}
