import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NavGestionComponent } from './nav-gestion.component';

describe('NavGestionComponent', () => {
  let component: NavGestionComponent;
  let fixture: ComponentFixture<NavGestionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NavGestionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NavGestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
