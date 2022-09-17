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
  title!:'Bienvenue';
  onOpenModal:any;
  public regions!:Region[];
  searchEmployees:any;
 
  constructor(private regionService: RegionService){}

  ngOnInit(): void {
      this.getRegions();
  }
  public getRegions(): void {
    this.regionService.getRegions().subscribe(
      (data: Region[]) => {
        console.log(data);
        this.regions = data;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }


}
