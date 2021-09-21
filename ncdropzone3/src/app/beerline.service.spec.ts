import { TestBed } from '@angular/core/testing';

import { BeerlineService } from './beerline.service';

describe('BeerlineService', () => {
  let service: BeerlineService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BeerlineService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
