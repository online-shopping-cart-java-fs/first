import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RetrieveItemComponent } from './retrieve-item/retrieve-item.component';
import { StoreItemComponent } from './store-item/store-item.component';
import { UpdateItemComponent } from './update-item/update-item.component';
import { DeleteItemComponent } from './delete-item/delete-item.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { MyGaurds } from './app.guards';
import { UpdateProductComponent } from './update-product/update-product.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { StoreAddressComponent } from './store-address/store-address.component';
import { UpdateAddressComponent } from './update-address/update-address.component';
import { DeleteAddressComponent } from './delete-address/delete-address.component';
import { StoreCreditcardComponent } from './store-creditcard/store-creditcard.component';
import { UpdateCreditcardComponent } from './update-creditcard/update-creditcard.component';
import { DeleteCreditcardComponent } from './delete-creditcard/delete-creditcard.component';
import { GetCreditcardByidComponent } from './get-creditcard-byid/get-creditcard-byid.component';
import { StoreOrdersComponent } from './store-orders/store-orders.component';
import { DeleteOrdersComponent } from './delete-orders/delete-orders.component';
import { RetriveAllOrdersComponent } from './retrive-all-orders/retrive-all-orders.component';
import { UpdatecustomerDataComponent } from './updatecustomer-data/updatecustomer-data.component';
import { StorecustomerDataComponent } from './storecustomer-data/storecustomer-data.component';
import { RetrieveProductComponent } from './retrieve-product/retrieve-product.component';
import { StoreProductComponent } from './store-product/store-product.component';
import { PageHomeComponent } from './page-home/page-home.component';
import { RetrieveProductbyidComponent } from './retrieve-productbyid/retrieve-productbyid.component';
import { RetriveAddressComponent } from './retrive-address/retrive-address.component';


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

    RetriveAddressComponent,

    StoreAddressComponent,
    UpdateAddressComponent,
    DeleteAddressComponent,
    StoreCreditcardComponent,
    UpdateCreditcardComponent,
    DeleteCreditcardComponent,
    GetCreditcardByidComponent,
    StoreOrdersComponent,
    DeleteOrdersComponent,
    RetriveAllOrdersComponent,
    UpdatecustomerDataComponent,
    StorecustomerDataComponent,
    PageHomeComponent,
    RetrieveProductbyidComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [MyGaurds],
  bootstrap: [AppComponent]
})
export class AppModule { }
