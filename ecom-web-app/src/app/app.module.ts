import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { RouterModule, Routes } from '@angular/router';
import {CustomersComponent} from "./customers/customers.component";

const routes: Routes = [
  { path: '', component: AppComponent },
  { path: 'products', component: ProductsComponent },
  { path: 'customers', component: CustomersComponent }
];

@NgModule({

  imports: [BrowserModule, HttpClientModule, RouterModule.forRoot(routes)],
  providers: [],
  bootstrap: []
})
export class AppModule {}
