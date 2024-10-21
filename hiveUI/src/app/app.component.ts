import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {ProductPageComponent} from './product-page/product-page.component';
import {Product} from './product/model';
import {ProductService} from './product/service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ProductPageComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  products: Product[] = [];
  constructor(private productService: ProductService) {}

  title = 'hiveUI';

  ngOnInit() {
    this.productService.getAllProducts().subscribe(data => {
      this.products = data;
      console.log(this.products);  // Check the products fetched from the backend
    });
  }
}

