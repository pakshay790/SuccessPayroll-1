import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MiscreceiptComponent } from './miscreceipt.component';

describe('MiscreceiptComponent', () => {
  let component: MiscreceiptComponent;
  let fixture: ComponentFixture<MiscreceiptComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MiscreceiptComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MiscreceiptComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
