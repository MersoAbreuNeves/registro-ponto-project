import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FuncionarioFormsComponent } from './funcionario-forms.component';

describe('FuncionarioFormsComponent', () => {
  let component: FuncionarioFormsComponent;
  let fixture: ComponentFixture<FuncionarioFormsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FuncionarioFormsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FuncionarioFormsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
