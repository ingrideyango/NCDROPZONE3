import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AvionService {
  private apiUrl: string = `${environment.apiUrl}/avion`;

  constructor(private http: HttpClient) { }

  findAll() {
    return this.http
      .get(this.apiUrl);
  }

  add(avion: any) {
    return this.http.post(this.apiUrl, avion);
  }

  update(avion: any) {
    return this.http
    .put(`${ this.apiUrl }/${ avion.id }`, avion);
  }

  delete(avion: any) {
    return this.http
      .delete(`${ this.apiUrl }/${ avion.id }`);
  }
}
