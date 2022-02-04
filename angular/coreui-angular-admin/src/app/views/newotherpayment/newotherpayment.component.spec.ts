import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewotherpaymentComponent } from './newotherpayment.component';

describe('NewotherpaymentComponent', () => {
  let component: NewotherpaymentComponent;
  let fixture: ComponentFixture<NewotherpaymentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewotherpaymentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewotherpaymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
