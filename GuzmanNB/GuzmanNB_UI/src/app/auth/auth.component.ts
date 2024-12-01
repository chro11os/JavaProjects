import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css'],
  standalone: true,
  imports: [CommonModule, FormsModule]
})
export class AuthComponent {
  activeTab: string = 'login'; // Default to the login tab

  // Login form fields
  loginEmail: string = '';
  loginPassword: string = '';

  // Sign-up form fields
  signupUsername: string = '';
  signupEmail: string = '';
  signupPassword: string = '';
  retypePassword: string = '';

  constructor(private authService: AuthService, private router: Router) {}

  // Method to switch between login and sign-up tabs
  setActiveTab(tab: string) {
    this.activeTab = tab;
  }

  // Handle login
  onLogin() {
    this.authService.login(this.loginEmail, this.loginPassword).subscribe(
      (response) => {
        // Save the token and redirect on successful login
        this.authService.saveToken(response.token);
        console.log('Login successful:', response);
        this.router.navigate(['/']); // Redirect to the Product List page
      },
      (error) => {
        // Handle login error (e.g., display an error message)
        console.error('Login failed:', error);
      }
    );
  }

  // Handle sign-up
  onSignUp() {
    this.authService.register(this.signupEmail, this.signupUsername, this.signupPassword, this.retypePassword).subscribe(
      (response) => {
        // Handle successful registration (e.g., save the token, redirect)
        console.log('Sign-up successful:', response);
        this.router.navigate(['/']); // Redirect to the Product List page
      },
      (error) => {
        // Handle sign-up error (e.g., display an error message)
        console.error('Sign-up failed:', error);
      }
    );
  }
}
