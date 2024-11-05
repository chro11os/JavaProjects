import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CartItem } from '../models/cart-item.model'; // Adjust the path as needed

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private apiUrl = 'http:/localhost:8080/api/cart'; // Ensure this matches your back-end endpoint

  constructor(private http: HttpClient) {}

  getCartItems(userId: number): Observable<CartItem[]> {
    return this.http.get<CartItem[]>(`${this.apiUrl}/${userId}`);
  }

  addToCart(cartItem: CartItem): Observable<CartItem> {
    return this.http.post<CartItem>(`${this.apiUrl}/add`, cartItem);
  }

  updateCartItem(cartItem: CartItem): Observable<void> {
    return this.http.put<void>(`${this.apiUrl}/update`, cartItem);
  }

  removeCartItem(cartItemId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/remove/${cartItemId}`);
  }
}
