import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { FuncionarioListComponent } from './pages/cadastro/funcionario/funcionario-list/funcionario-list.component';
import { HomeComponent } from './pages/home/home.component';


const routes: Routes = [
{path:'', component:LoginComponent},
{path:'home', component:HomeComponent},
{path:'funcionarios', component:FuncionarioListComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
