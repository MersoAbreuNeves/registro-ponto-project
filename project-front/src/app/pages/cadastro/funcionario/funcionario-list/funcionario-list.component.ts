/* eslint-disable @angular-eslint/no-empty-lifecycle-method */
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-funcionario-list',
  templateUrl: './funcionario-list.component.html',
  styleUrls: ['./funcionario-list.component.scss']
})
export class FuncionarioListComponent implements OnInit {
  elements: any = [
    {nome: 'Maria José da Silva', cargo: 'Assistente TI'},
    { nome: 'Roberto Cabral dos Santos', cargo: 'Gerente de Projetos'},
    { nome: 'Juciele dos SAntos Bezerra', cargo: 'Motorista'},

  ];

  headElements = ['Nome', 'Cargo', 'Ações'];

  constructor() { }

  ngOnInit(): void {
  }

}
