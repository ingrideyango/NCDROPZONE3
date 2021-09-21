import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BeerlineService {
  private apiUrl: string = `${ environment.apiUrl }/vol/etatVol`;
  constructor(private http :HttpClient) { }

  findAll(){
    return this.http.get(this.apiUrl)
  }
}
