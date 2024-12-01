import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';  // Import CommonModule

import { AppComponent } from './app.component';
import { ProductListComponent } from './product-list/product-list.component';
import { CartComponent } from './cart/cart.component';
import { AuthComponent } from './auth/auth.component';
import {AppRoutingModule, routes} from './app.routes';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [

  ],
  imports: [
    BrowserModule,
    CommonModule,  // Add CommonModule here
    RouterModule.forRoot(routes),
    ProductListComponent,
    CartComponent,
    AuthComponent,
    AppComponent,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
