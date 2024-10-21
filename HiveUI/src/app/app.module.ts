import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';  // Make sure this path is correct

@NgModule({
  declarations: [  // Declare your components here

  ],
  imports: [  // Import modules here
    BrowserModule,
    HttpClientModule,
    AppComponent,
    // Import HttpClientModule here
  ],
  providers: [],  // Any services or providers go here (if needed)
  bootstrap: []  // Bootstraps the main AppComponent
})
export class AppModule { }
