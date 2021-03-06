import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { MyGaurds } from './app.guards';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [

  {path:"\login",component:LoginComponent},
  {path:"\home",component:HomeComponent},
  {path:"\signup",component:SignupComponent},
  {path:"\customer",component:CustomerDashboardComponent},
  {path:"\admin",component:AdminDashboardComponent,canActivate:[MyGaurds]},
  {path:"",redirectTo:"\home",pathMatch:"prefix"},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
