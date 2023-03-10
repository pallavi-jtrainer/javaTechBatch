import { RegisterComponent } from './../register/register.component';
import { StudentdetailsComponent } from './../studentdetails/studentdetails.component';
import { ShowstudentsComponent } from './../showstudents/showstudents.component';
import { LoginComponent } from './../login/login.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'students/:id', component: ShowstudentsComponent},
  {path: 'student/:id', component: StudentdetailsComponent},
  {path: 'register', component:RegisterComponent},
  {path: '', redirectTo: 'login', pathMatch: 'full'}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
