import { ComponentFixture, TestBed } from '@angular/core/testing';

<<<<<<< HEAD:angular/coreui-angular-admin/src/app/views/miscpayment/miscpayment.component.spec.ts
import { MiscpaymentComponent } from './miscpayment.component';

describe('MiscpaymentComponent', () => {
  let component: MiscpaymentComponent;
  let fixture: ComponentFixture<MiscpaymentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MiscpaymentComponent ]
=======
import { PayrollDashboardComponent } from './payroll-dashboard.component';

describe('PayrollDashboardComponent', () => {
  let component: PayrollDashboardComponent;
  let fixture: ComponentFixture<PayrollDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PayrollDashboardComponent ]
>>>>>>> ed3a0b3408b5d76c681bf7c43f5a35fbd3a6df6b:angular/coreui-angular-admin/src/app/payroll/payroll-dashboard/payroll-dashboard.component.spec.ts
    })
    .compileComponents();
  });

  beforeEach(() => {
<<<<<<< HEAD:angular/coreui-angular-admin/src/app/views/miscpayment/miscpayment.component.spec.ts
    fixture = TestBed.createComponent(MiscpaymentComponent);
=======
    fixture = TestBed.createComponent(PayrollDashboardComponent);
>>>>>>> ed3a0b3408b5d76c681bf7c43f5a35fbd3a6df6b:angular/coreui-angular-admin/src/app/payroll/payroll-dashboard/payroll-dashboard.component.spec.ts
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
