import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyGaurds } from 'src/app.guards';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [

  {path:"\login",component:LoginComponent},
  {path:"\home",component:HomeComponent},
  {path:"\admin",component:AdminDashboardComponent,},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
