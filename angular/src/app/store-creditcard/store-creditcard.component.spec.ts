import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoreCreditcardComponent } from './store-creditcard.component';

describe('StoreCreditcardComponent', () => {
  let component: StoreCreditcardComponent;
  let fixture: ComponentFixture<StoreCreditcardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StoreCreditcardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StoreCreditcardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
