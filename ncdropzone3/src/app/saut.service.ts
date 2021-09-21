import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class SautService {
  private apiUrl: string = `${ environment.apiUrl }/saut`;

  constructor(private http: HttpClient) { }

  findAll() {
    return this.http.get(this.apiUrl);
  }

  add(saut: any) {
    return this.http.post(this.apiUrl, saut);
  }

  delete(saut: any) {
    return this.http.delete(`${ this.apiUrl }/${ saut.id }`);
  }

  update(saut: any) {
    return this.http.put(`${ this.apiUrl }/${ saut.id }`, saut);
  }

}
