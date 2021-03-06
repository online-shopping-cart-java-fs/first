import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetCreditcardByidComponent } from './get-creditcard-byid.component';

describe('GetCreditcardByidComponent', () => {
  let component: GetCreditcardByidComponent;
  let fixture: ComponentFixture<GetCreditcardByidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetCreditcardByidComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetCreditcardByidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
