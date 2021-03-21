import { NgModule } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RetrieveItemComponent } from './retrieve-item/retrieve-item.component';
import { StoreItemComponent } from './store-item/store-item.component';
import { UpdateItemComponent } from './update-item/update-item.component';
import { DeleteItemComponent } from './delete-item/delete-item.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { MyGaurds } from './app.guards';
import { UpdateProductComponent } from './update-product/update-product.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { StoreOrdersComponent } from './store-orders/store-orders.component';
import { DeleteOrdersComponent } from './delete-orders/delete-orders.component';
import { UpdatecustomerDataComponent } from './updatecustomer-data/updatecustomer-data.component';
import { RetrieveProductComponent } from './retrieve-product/retrieve-product.component';
import { StoreProductComponent } from './store-product/store-product.component';
import { PageHomeComponent } from './page-home/page-home.component';
import { RetrieveProductbyidComponent } from './retrieve-productbyid/retrieve-productbyid.component';
import { PageAdminComponent } from './page-admin/page-admin.component';
import { StoretoCartComponent } from './storeto-cart/storeto-cart.component';
import { RetrieveProductcustomerComponent } from './retrieve-productcustomer/retrieve-productcustomer.component';
import { RetrieveItemcustomerComponent } from './retrieve-itemcustomer/retrieve-itemcustomer.component';
import { RetrieveProductbyidcustomerComponent } from './retrieve-productbyidcustomer/retrieve-productbyidcustomer.component';
import { ProfileComponent } from './profile/profile.component';
import { OrderDetailsComponent } from './order-details/order-details.component';
import { OrdersComponent } from './orders/orders.component';
import { PasswordComponent } from './password/password.component';

@NgModule({
  declarations: [
    AppComponent,
    RetrieveItemComponent,
    StoreItemComponent,
    UpdateItemComponent,
    DeleteItemComponent,
    CustomerDashboardComponent,
    AdminDashboardComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    RetrieveProductComponent,
    StoreProductComponent,
    UpdateProductComponent,
    DeleteProductComponent,
    RetrieveItemComponent,


    StoreOrdersComponent,
    DeleteOrdersComponent,


    UpdatecustomerDataComponent,
    PageHomeComponent,
    RetrieveProductbyidComponent,
    PageAdminComponent,
    StoretoCartComponent,
    RetrieveProductcustomerComponent,
    RetrieveItemcustomerComponent,
    RetrieveProductbyidcustomerComponent,
    ProfileComponent,
    OrderDetailsComponent,
    OrdersComponent,
    PasswordComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [MyGaurds],
  bootstrap: [AppComponent],
})
export class AppModule {}
