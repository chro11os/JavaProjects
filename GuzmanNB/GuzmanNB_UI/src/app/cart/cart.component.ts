import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; // Import CommonModule
import { FormsModule } from '@angular/forms'; // Import FormsModule

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css'],
  standalone: true, // Indicating that this is a standalone component
  imports: [CommonModule, FormsModule] // Include CommonModule and FormsModule here
})
export class CartComponent {
  cartItems: any[] = [];
  totalPrice: number = 0;

  constructor() {
    // Sample data, replace with your actual data from service
    this.cartItems = [
      { id: 1, name: 'Product 1', price: 10.99, imageUrl: 'path/to/image1.jpg', description: 'Description 1', quantity: 2, selected: false },
      { id: 2, name: 'Product 2', price: 15.49, imageUrl: 'path/to/image2.jpg', description: 'Description 2', quantity: 1, selected: false }
    ];
    this.calculateTotalPrice();
  }

  calculateTotalPrice(): void {
    this.totalPrice = this.cartItems
      .filter(item => item.selected)
      .reduce((total, item) => total + (item.price * item.quantity), 0);
  }

  updateQuantity(item: any, quantity: number): void {
    item.quantity = quantity;
    this.calculateTotalPrice();
  }

  removeItem(item: any): void {
    this.cartItems = this.cartItems.filter(cartItem => cartItem.id !== item.id);
    this.calculateTotalPrice();
  }

  toggleItemSelection(item: any): void {
    item.selected = !item.selected;
    this.calculateTotalPrice();
  }

  placeOrder(): void {
    const selectedItems = this.cartItems.filter(item => item.selected);
    if (selectedItems.length > 0) {
      alert('Order placed successfully!');
    } else {
      alert('Please select items to place an order.');
    }
  }
}
