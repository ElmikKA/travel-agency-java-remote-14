import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {TripDto} from "../../models/trips";
import {allTripsUrl, createTripUrl} from "../../models/urls";

@Injectable({
  providedIn: 'root'
})
export class TripService {

  constructor(private http: HttpClient) { }

  getAllTrips(): Observable<TripDto[]>{
    return this.http.get<TripDto[]>(allTripsUrl)
  }

  createNewTrip(trip: TripDto){
    return this.http.post<TripDto>(createTripUrl, trip)
  }
}
