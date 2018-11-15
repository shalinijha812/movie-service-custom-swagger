import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
// import {MaterialModule} from '@angular/material'

import{ MatCardModule } from '@angular/material/card';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { RecommedationCardComponent } from './recommedation-card/recommedation-card.component';

@NgModule({
  declarations: [
    AppComponent,
    RecommedationCardComponent,
    //HttpClientModule
  ],
  imports: [
    BrowserModule,
    FormsModule,
    MatCardModule,
    HttpClientModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
