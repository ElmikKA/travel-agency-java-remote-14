import { Component, OnInit } from '@angular/core';
import {aboutusUrl, defaultUrl, homeUrl, tripsUrl} from "../../models/urls";

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent {

  home = homeUrl
  aboutUs = aboutusUrl
  trips = tripsUrl

}
