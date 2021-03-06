import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetriveOrdersByidComponent } from './retrive-orders-byid.component';

describe('RetriveOrdersByidComponent', () => {
  let component: RetriveOrdersByidComponent;
  let fixture: ComponentFixture<RetriveOrdersByidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetriveOrdersByidComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetriveOrdersByidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
