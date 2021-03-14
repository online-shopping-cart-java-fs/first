import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveItemcustomerComponent } from './retrieve-itemcustomer.component';

describe('RetrieveItemcustomerComponent', () => {
  let component: RetrieveItemcustomerComponent;
  let fixture: ComponentFixture<RetrieveItemcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveItemcustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveItemcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
