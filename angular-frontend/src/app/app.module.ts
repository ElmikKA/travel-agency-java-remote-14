import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TripListComponent } from './components/trip-list/trip-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatCardModule} from "@angular/material/card";
import {HttpClientModule} from "@angular/common/http";
import {MatButtonModule} from "@angular/material/button";
import { HeaderComponent } from './components/header/header.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import {MatButtonToggleModule} from "@angular/material/button-toggle";
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { HomeComponent } from './components/home/home.component';
import {RouterModule} from "@angular/router";
import {aboutusUrl, defaultUrl, homeUrl, notFound, tripsUrl} from "./models/urls";
import { NotFoundComponent } from './components/not-found/not-found.component';
import {MatIconModule} from "@angular/material/icon";
import { TripFormComponent } from './components/trip-form/trip-form.component';

@NgModule({
  declarations: [
    AppComponent,
    TripListComponent,
    HeaderComponent,
    NavigationComponent,
    AboutusComponent,
    HomeComponent,
    NotFoundComponent,
    TripFormComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatCardModule,
    MatButtonModule,
    MatButtonToggleModule,
    RouterModule.forRoot([
      {path: homeUrl, component: HomeComponent},
      {path: defaultUrl, component: HomeComponent},
      {path: aboutusUrl, component: AboutusComponent},
      {path: tripsUrl, component: TripListComponent},
      {path: notFound, component: NotFoundComponent}
    ]),
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
