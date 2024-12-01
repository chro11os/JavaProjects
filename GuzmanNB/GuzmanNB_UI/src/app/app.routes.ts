import {RouterModule, Routes} from '@angular/router';
import { ProductListComponent } from './product-list/product-list.component';
import { CartComponent } from './cart/cart.component';
import { AuthComponent } from './auth/auth.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
    {path: '', component: ProductListComponent },
    {path: 'cart', component: CartComponent },
    {path: 'auth', component: AuthComponent },

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}
