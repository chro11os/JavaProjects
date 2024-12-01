export interface CartItem {
  id: number;
  productId: number;
  userId: number;
  quantity: number;
  price: number;
  selected?: boolean; // Optional property to handle selection
}
