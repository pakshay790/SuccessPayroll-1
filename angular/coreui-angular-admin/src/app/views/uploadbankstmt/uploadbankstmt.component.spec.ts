import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UploadbankstmtComponent } from './uploadbankstmt.component';

describe('UploadbankstmtComponent', () => {
  let component: UploadbankstmtComponent;
  let fixture: ComponentFixture<UploadbankstmtComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UploadbankstmtComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UploadbankstmtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
