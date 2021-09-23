import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParachuteAssocieComponent } from './parachute-associe.component';

describe('ParachuteAssocieComponent', () => {
  let component: ParachuteAssocieComponent;
  let fixture: ComponentFixture<ParachuteAssocieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParachuteAssocieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ParachuteAssocieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
