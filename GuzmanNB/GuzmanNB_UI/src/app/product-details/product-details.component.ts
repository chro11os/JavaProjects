import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  standalone: true,
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  productId: number | null = null;

  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    // Get the product ID from the route parameters
    this.productId = Number(this.route.snapshot.paramMap.get('id'));
    // You can now use this productId to fetch product details
  }
}
