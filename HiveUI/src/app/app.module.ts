import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {AppComponent} from './app.component';
import {BrowserModule} from '@angular/platform-browser';


@NgModule({
  imports: [HttpClientModule, AppComponent],  // Other modules
  providers: [],  // Any providers

})
export class AppModule {}
