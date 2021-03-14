import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoretoCartComponent } from './storeto-cart.component';

describe('StoretoCartComponent', () => {
  let component: StoretoCartComponent;
  let fixture: ComponentFixture<StoretoCartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StoretoCartComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StoretoCartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
