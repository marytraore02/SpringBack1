import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Region } from './region';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RegionService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getRegions(): Observable<Region[]>{
    return this.http.get<Region[]>(`${this.apiServerUrl}/region/read`);
  }
  public getRegionSP(): Observable<Region[]>{
    return this.http.get<Region[]>(`${this.apiServerUrl}/region/lireSP`);
  }

  public createRegion(region: Region): Observable<Region>{
    return this.http.post<Region>(`${this.apiServerUrl}/region/create`, region);
  }

  public updateRegion(region: Region): Observable<Region>{
    return this.http.put<Region>(`${this.apiServerUrl}/region/update`, region);
  }

  public deleteRegion(regionId: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/region/delete/${regionId}`);
  }
  
}
