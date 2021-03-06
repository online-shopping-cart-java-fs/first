import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetriveAddressComponent } from './retrive-address.component';

describe('RetriveAddressComponent', () => {
  let component: RetriveAddressComponent;
  let fixture: ComponentFixture<RetriveAddressComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetriveAddressComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetriveAddressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
