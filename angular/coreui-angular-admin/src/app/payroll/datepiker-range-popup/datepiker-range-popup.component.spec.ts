import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DatepikerRangePopupComponent } from './datepiker-range-popup.component';

describe('DatepikerRangePopupComponent', () => {
  let component: DatepikerRangePopupComponent;
  let fixture: ComponentFixture<DatepikerRangePopupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DatepikerRangePopupComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DatepikerRangePopupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
