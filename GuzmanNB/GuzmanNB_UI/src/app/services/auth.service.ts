import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http//localhost:8080/api/auth'; // Base URL for your authentication API

  constructor(private http: HttpClient) {}

  // Function to log in a user
  login(email: string, password: string): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/login`, { email, password });
  }

  // Function to register a new user
  register(email: string, username: string, password: string, retypedPassword: string): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/signup`, { email, username, password, retypedPassword });
  }

  // Function to save the JWT token
  saveToken(token: string): void {
    localStorage.setItem('jwtToken', token);
  }

  // Function to get the JWT token
  getToken(): string | null {
    return localStorage.getItem('jwtToken');
  }

  // Function to check if the user is authenticated
  isAuthenticated(): boolean {
    const token = this.getToken();
    // Add your own logic here to check if the token is valid
    return token !== null;
  }

  // Function to log out the user
  logout(): void {
    localStorage.removeItem('jwtToken');
  }
}
