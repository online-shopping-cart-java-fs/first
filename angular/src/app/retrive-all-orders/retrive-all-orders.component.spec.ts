import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetriveAllOrdersComponent } from './retrive-all-orders.component';

describe('RetriveAllOrdersComponent', () => {
  let component: RetriveAllOrdersComponent;
  let fixture: ComponentFixture<RetriveAllOrdersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetriveAllOrdersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetriveAllOrdersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
