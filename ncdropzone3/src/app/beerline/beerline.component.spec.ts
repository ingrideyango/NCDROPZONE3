import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BeerlineComponent } from './beerline.component';

describe('BeerlineComponent', () => {
  let component: BeerlineComponent;
  let fixture: ComponentFixture<BeerlineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BeerlineComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BeerlineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
