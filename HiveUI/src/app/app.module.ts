import { NgModule } from '@angular/core';
import {bootstrapApplication, BrowserModule} from '@angular/platform-browser';
import { AppRoutingModule } from './app.routes'; // Make sure this path is correct
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { DetailsComponent } from './details/details.component';

@NgModule({
  declarations: [

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AppComponent,
    HomeComponent,
    DetailsComponent,
    // Ensure this is included
  ],
  providers: [],
  bootstrap: []
})
export class AppModule { }
