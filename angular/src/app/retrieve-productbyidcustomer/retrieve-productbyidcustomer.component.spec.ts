import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveProductbyidcustomerComponent } from './retrieve-productbyidcustomer.component';

describe('RetrieveProductbyidcustomerComponent', () => {
  let component: RetrieveProductbyidcustomerComponent;
  let fixture: ComponentFixture<RetrieveProductbyidcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveProductbyidcustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveProductbyidcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
