import { Component } from '@angular/core';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-product-page',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './product-page.component.html',
  styleUrl: './product-page.component.scss'
})
export class ProductPageComponent {
  products = [
    { name: 'Product 1', price: 29.99, image: 'assets/product1.jpg' },
    { name: 'Product 2', price: 49.99, image: 'assets/product2.jpg' },
    { name: 'Product 3', price: 19.99, image: 'assets/product3.jpg' },
    { name: 'Product 4', price: 59.99, image: 'assets/product4.jpg' },
    { name: 'Product 5', price: 39.99, image: 'assets/product5.jpg' },
    { name: 'Product 6', price: 24.99, image: 'assets/product6.jpg' }
  ];
}
