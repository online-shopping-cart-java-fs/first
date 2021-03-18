import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { MyGaurds } from './app.guards';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { DeleteItemComponent } from './delete-item/delete-item.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { OrderDetailsComponent } from './order-details/order-details.component';
import { OrdersComponent } from './orders/orders.component';
import { PageAdminComponent } from './page-admin/page-admin.component';
import { PageHomeComponent } from './page-home/page-home.component';
import { PasswordComponent } from './password/password.component';
import { ProfileComponent } from './profile/profile.component';
import { RetrieveItemComponent } from './retrieve-item/retrieve-item.component';
import { RetrieveItemcustomerComponent } from './retrieve-itemcustomer/retrieve-itemcustomer.component';
import { RetrieveProductComponent } from './retrieve-product/retrieve-product.component';
import { RetrieveProductbyidComponent } from './retrieve-productbyid/retrieve-productbyid.component';
import { RetrieveProductbyidcustomerComponent } from './retrieve-productbyidcustomer/retrieve-productbyidcustomer.component';
import { RetrieveProductcustomerComponent } from './retrieve-productcustomer/retrieve-productcustomer.component';
import { SignupComponent } from './signup/signup.component';
import { StoreItemComponent } from './store-item/store-item.component';
import { StoreProductComponent } from './store-product/store-product.component';
import { StoretoCartComponent } from './storeto-cart/storeto-cart.component';
import { UpdateItemComponent } from './update-item/update-item.component';
import { UpdateProductComponent } from './update-product/update-product.component';

const routes: Routes = [

  {path:"",redirectTo:"\home",pathMatch:"prefix"},
  {path:"\home",component:HomeComponent,children:[

    {path:"",component:PageHomeComponent},
    {path:"\login",component:LoginComponent},
    {path:"\signup",component:SignupComponent},
    {path:"\password",component:PasswordComponent},

  ]},
  {path:"\customer",component:CustomerDashboardComponent,canActivate:[MyGaurds],children:[

    {path:"",component:PageAdminComponent},
    {path:"\orders",component:OrdersComponent},
    {path:"\cart",component:StoretoCartComponent},
    {path:"\orderdetails",component:OrderDetailsComponent},
    {path:"\profile",component:ProfileComponent},
    {path:"\categorycustomer",component:RetrieveItemcustomerComponent,children:[

      {path:"\allproductsbycatcust/:itemid",component:RetrieveProductbyidcustomerComponent},
      
    ]},

    {path:"\allproductscustomer",component:RetrieveProductcustomerComponent,children:[

      {path:"\addtocart/:pid",component:StoretoCartComponent},

    ]},

  ]},
  {path:"\admin",component:AdminDashboardComponent,canActivate:[MyGaurds],children:[

    {path:"\category",component:RetrieveItemComponent,children:[

      {path:"\allproductsbycat/:itemid",component:RetrieveProductbyidComponent},
      
    ]},

    {path:"\allproducts",component:RetrieveProductComponent},
    {path:"\additems",component:StoreItemComponent},
    {path:"\itemupdate",component:UpdateItemComponent},
    {path:"\deleteitem",component:DeleteItemComponent},
    {path:"\addproducts",component:StoreProductComponent},
    {path:"\productupdate",component:UpdateProductComponent},
    {path:"\deleteproduct",component:DeleteProductComponent},
  ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
