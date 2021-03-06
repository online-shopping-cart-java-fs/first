import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { MyGaurds } from './app.guards';
import { HeaderHomeComponent } from './header-home/header-home.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [

  {path:"",redirectTo:"\home",pathMatch:"prefix"},
  {path:"\login",component:LoginComponent},
  {path:"\signup",component:SignupComponent},
  {path:"\home",component:HomeComponent},
  {path:"\admin",component:AdminDashboardComponent,canActivate:[MyGaurds]},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
