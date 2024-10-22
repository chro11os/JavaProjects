import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';  // Make sure this path is correct

@NgModule({
  declarations: [  // Declare your components here

  ],
  imports: [  // Import modules here
    BrowserModule,
    AppComponent,
    // Import HttpClientModule here
  ],
  providers: [],  // Any services or providers go here (if needed)
  bootstrap: []  // Bootstraps the main AppComponent
})
export class AppModule { }
