import { TestBed } from '@angular/core/testing';

import { ModuleAvionnageService } from './module-avionnage.service';

describe('ModuleAvionnageService', () => {
  let service: ModuleAvionnageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ModuleAvionnageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
