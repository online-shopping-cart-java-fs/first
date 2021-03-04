import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveItemComponent } from './retrieve-item.component';

describe('RetrieveItemComponent', () => {
  let component: RetrieveItemComponent;
  let fixture: ComponentFixture<RetrieveItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveItemComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
