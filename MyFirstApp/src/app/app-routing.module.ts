import { RouterModule } from '@angular/router';
import { TestcomponentComponent } from './testcomponent/testcomponent.component';
import { ComponenttwoComponent } from './componenttwo/componenttwo.component';
import { NgModule, Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, Routes } from '@angular/router';

const routes : Routes = [
  {path: '', component: ComponenttwoComponent},
  {path: 'test', component: TestcomponentComponent}
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
