import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
  standalone: true,  // Indicate that this is a standalone component
  imports: [CommonModule]  // Import CommonModule to use *ngFor and currency pipe
})
export class ProductListComponent {
  products = [
    { id: 1, name: 'Product 1', price: 10.99, imageUrl: 'assets/images/image1.jpg', description: 'Description 1', stock: 5 },
    { id: 2, name: 'Product 2', price: 15.49, imageUrl: 'assets/images/image2.jpg', description: 'Description 2', stock: 3 },
    { id: 3, name: 'Product 3', price: 20.00, imageUrl: 'assets/images/image3.jpg', description: 'Description 3', stock: 8 },
    { id: 4, name: 'Product 4', price: 25.99, imageUrl: 'assets/images/image4.jpg', description: 'Description 4', stock: 2 },
    { id: 5, name: 'Product 5', price: 30.49, imageUrl: 'assets/images/image5.jpg', description: 'Description 5', stock: 6 },
    { id: 6, name: 'Product 6', price: 35.00, imageUrl: 'assets/images/image6.jpg', description: 'Description 6', stock: 7 },
    { id: 7, name: 'Product 7', price: 40.99, imageUrl: 'assets/images/image7.jpg', description: 'Description 7', stock: 10 },
    { id: 8, name: 'Product 8', price: 45.49, imageUrl: 'assets/images/image8.jpg', description: 'Description 8', stock: 4 },
    { id: 9, name: 'Product 9', price: 50.00, imageUrl: 'assets/images/image9.jpg', description: 'Description 9', stock: 3 },
    { id: 10, name: 'Product 10', price: 55.99, imageUrl: 'assets/images/image10.jpg', description: 'Description 10', stock: 8 },
    { id: 11, name: 'Product 11', price: 60.49, imageUrl: 'assets/images/image11.jpg', description: 'Description 11', stock: 1 },
    { id: 12, name: 'Product 12', price: 65.00, imageUrl: 'assets/images/image12.jpg', description: 'Description 12', stock: 9 }
  ];

  constructor(private router: Router) {}

  goToProduct(productId: number): void {
    this.router.navigate(['/products', productId]);
  }

  addToCart(product: any): void {
    console.log('Adding product to cart:', product);
    // You can expand this method to interact with a cart service and manage the cart
  }
}
