import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Region } from './region';
import { RegionService } from './region.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public regions!: Region[];
  
  constructor(private regionService: RegionService){}

  ngOnInit(): void {
      this.getRegion();
  }
  public getRegion(): void {
    this.regionService.getRegion().subscribe(
      (response: Region[]) => {
        this.regions = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }


}
