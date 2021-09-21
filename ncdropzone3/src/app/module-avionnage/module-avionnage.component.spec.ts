import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModuleAvionnageComponent } from './module-avionnage.component';

describe('ModuleAvionnageComponent', () => {
  let component: ModuleAvionnageComponent;
  let fixture: ComponentFixture<ModuleAvionnageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModuleAvionnageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModuleAvionnageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
