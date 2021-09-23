import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TandemComponent } from './tandem.component';

describe('TandemComponent', () => {
  let component: TandemComponent;
  let fixture: ComponentFixture<TandemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TandemComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TandemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
