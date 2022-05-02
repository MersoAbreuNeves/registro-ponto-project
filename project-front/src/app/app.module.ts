
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';

import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';

import { LoginModule } from './login/login.module';
import { NavbarModule, WavesModule, ButtonsModule } from 'angular-bootstrap-md';
import { HomeComponent } from './pages/home/home.component';
import { NavBarComponent } from './pages/nav-bar/nav-bar.component';
import { FuncionarioListComponent } from './pages/cadastro/funcionario/funcionario-list/funcionario-list.component';
import { FuncionarioFormsComponent } from './pages/cadastro/funcionario/funcionario-forms/funcionario-forms.component'


@NgModule({
  declarations: [AppComponent, HomeComponent, NavBarComponent, FuncionarioListComponent, FuncionarioFormsComponent],
  imports: [
    BrowserModule,
    LoginModule,
    BrowserAnimationsModule,
    MDBBootstrapModule.forRoot(),
    FormsModule,
    NavbarModule,
    WavesModule,
    ButtonsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
