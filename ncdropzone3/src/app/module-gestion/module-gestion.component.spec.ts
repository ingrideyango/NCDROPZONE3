import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModuleGestionComponent } from './module-gestion.component';

describe('ModuleGestionComponent', () => {
  let component: ModuleGestionComponent;
  let fixture: ComponentFixture<ModuleGestionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModuleGestionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModuleGestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
