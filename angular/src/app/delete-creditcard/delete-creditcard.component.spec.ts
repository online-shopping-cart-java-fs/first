import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteCreditcardComponent } from './delete-creditcard.component';

describe('DeleteCreditcardComponent', () => {
  let component: DeleteCreditcardComponent;
  let fixture: ComponentFixture<DeleteCreditcardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteCreditcardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteCreditcardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
