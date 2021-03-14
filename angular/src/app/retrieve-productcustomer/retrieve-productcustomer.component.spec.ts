import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveProductcustomerComponent } from './retrieve-productcustomer.component';

describe('RetrieveProductcustomerComponent', () => {
  let component: RetrieveProductcustomerComponent;
  let fixture: ComponentFixture<RetrieveProductcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveProductcustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveProductcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
