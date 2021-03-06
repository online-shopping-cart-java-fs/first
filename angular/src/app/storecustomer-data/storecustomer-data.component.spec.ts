import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StorecustomerDataComponent } from './storecustomer-data.component';

describe('StorecustomerDataComponent', () => {
  let component: StorecustomerDataComponent;
  let fixture: ComponentFixture<StorecustomerDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StorecustomerDataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StorecustomerDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
