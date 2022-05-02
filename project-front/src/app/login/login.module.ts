
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { FormsModule } from '@angular/forms';
import { LoginRoutingModule } from './login-routing.module';
import { LoginComponent } from './login.component';

@NgModule({
  declarations: [
    LoginComponent

  ],
  imports: [
    MDBBootstrapModule.forRoot(),
    FormsModule,
    LoginRoutingModule
  ],
  providers: [],
  bootstrap: [LoginComponent]
})
export class LoginModule { }
