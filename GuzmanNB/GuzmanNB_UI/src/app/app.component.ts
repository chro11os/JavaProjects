import { Component } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'] // Fixed from `styleUrl` to `styleUrls`
})
export class AppComponent {
  title = 'GuzmanNB_UI';

  constructor(private router: Router) {} // Added curly braces to complete the constructor

  navigateToAuth() {
    this.router.navigate(['/auth']);
  }

  // Method to navigate to the Product List page
  navigateToProducts(): void {
    this.router.navigate(['/']); // Navigates to the root route (Product List)
  }

  navigateToCart(): void {
    this.router.navigate(['/cart']); // Navigates to the Cart route
  }
}
