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
import { StoreCreditcardComponent } from './store-creditcard/store-creditcard.component';
import { UpdateCreditcardComponent } from './update-creditcard/update-creditcard.component';
import { DeleteCreditcardComponent } from './delete-creditcard/delete-creditcard.component';
import { GetCreditcardByidComponent } from './get-creditcard-byid/get-creditcard-byid.component';
import { RetriveOrdersByidComponent } from './retrive-orders-byid/retrive-orders-byid.component';
import { StoreOrdersComponent } from './store-orders/store-orders.component';
import { DeleteOrdersComponent } from './delete-orders/delete-orders.component';
import { RetriveAllOrdersComponent } from './retrive-all-orders/retrive-all-orders.component';

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
    StoreCreditcardComponent,
    UpdateCreditcardComponent,
    DeleteCreditcardComponent,
    GetCreditcardByidComponent,
    RetriveOrdersByidComponent,
    StoreOrdersComponent,
    DeleteOrdersComponent,
    RetriveAllOrdersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [MyGaurds],
  bootstrap: [AppComponent]
})
export class AppModule { }
