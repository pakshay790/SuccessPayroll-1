import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {
  AlertModule,
  BadgeModule,
  ButtonModule,
  CardModule,
  FormModule,
  GridModule,
  ModalModule,
  PopoverModule,
  ProgressModule,
  SharedModule,
  ToastModule,
  TooltipModule,
  UtilitiesModule,
  ButtonGroupModule,
  AvatarModule,
  TableModule,
} from '@coreui/angular';

import { ComponentsModule } from '../../components/components.module';
import { PayrollRoutingModule } from './payroll-routing.module';

import { ReactiveFormsModule } from '@angular/forms';
import { WidgetsModule } from '../views/widgets/widgets.module';
import { CalloutModule, NavModule, TabsModule } from '@coreui/angular';
import { IconModule } from '@coreui/icons-angular';
import { RouterModule } from '@angular/router';
import { PayrollDashboardComponent } from './payroll-dashboard/payroll-dashboard.component';
import { PendingComponent } from './pending/pending.component';
import { VacationComponent } from './vacation/vacation.component';
import { EmployeeComponent } from './employee/employee.component';

import { ChartjsModule } from '@coreui/angular-chartjs';
import { MyTeamManagementComponent } from './myteam-management/myteam-management.component';
import { RunPayrollComponent } from './run-payroll/run-payroll.component';

@NgModule({
  declarations: [ 
    PayrollDashboardComponent, 
    PendingComponent, 
    VacationComponent, 
    EmployeeComponent,
    MyTeamManagementComponent, 
    RunPayrollComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    ComponentsModule,
    AlertModule,
    GridModule,
    CardModule,
    BadgeModule,
    ButtonModule,
    FormModule,
    ModalModule,
    ToastModule,
    SharedModule,
    TooltipModule,
    PopoverModule,
    ProgressModule,
    PayrollRoutingModule,
    WidgetsModule,
    NavModule,
    IconModule,
    RouterModule,
    TabsModule,
    UtilitiesModule,
    CalloutModule,
    ButtonGroupModule,
    ChartjsModule,
    AvatarModule,
    TableModule,
    IconModule,
  ],
})
export class PayrollModule {
}