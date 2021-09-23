import { TestBed } from '@angular/core/testing';

import { TandemService } from './tandem.service';

describe('TandemService', () => {
  let service: TandemService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TandemService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
