import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatecustomerDataComponent } from './updatecustomer-data.component';

describe('UpdatecustomerDataComponent', () => {
  let component: UpdatecustomerDataComponent;
  let fixture: ComponentFixture<UpdatecustomerDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdatecustomerDataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatecustomerDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
