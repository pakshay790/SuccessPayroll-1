import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MiscpaymentComponent } from './miscpayment.component';

describe('MiscpaymentComponent', () => {
  let component: MiscpaymentComponent;
  let fixture: ComponentFixture<MiscpaymentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MiscpaymentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MiscpaymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
