import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveProductbyidComponent } from './retrieve-productbyid.component';

describe('RetrieveProductbyidComponent', () => {
  let component: RetrieveProductbyidComponent;
  let fixture: ComponentFixture<RetrieveProductbyidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveProductbyidComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveProductbyidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
