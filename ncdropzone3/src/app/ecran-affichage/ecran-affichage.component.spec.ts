import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EcranAffichageComponent } from './ecran-affichage.component';

describe('EcranAffichageComponent', () => {
  let component: EcranAffichageComponent;
  let fixture: ComponentFixture<EcranAffichageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EcranAffichageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EcranAffichageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
