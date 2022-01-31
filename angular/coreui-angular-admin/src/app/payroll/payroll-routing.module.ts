import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent } from '../payroll/dashboard/dashboard.component';
import { EmployeeComponent } from '../payroll/employee/employee.component';
import { VacationComponent } from '../payroll/vacation/vacation.component';
import { PendingComponent } from '../payroll/pending/pending.component';

const routes: Routes = [
  {
    path: '',
    data: {
      title: 'Payroll'
    },
    children: [
      {
        path: '',
        redirectTo: 'dashboard'
      },
      {
        path: 'dashboard',
        component: DashboardComponent,
        data: {
          title: 'Dashboard'
        }
      },
      {
        path: 'employee',
        component: EmployeeComponent,
        data: {
          title: 'Employee'
        }
      },
      {
        path: 'vacation',
        component: VacationComponent,
        data: {
          title: 'Apply Vacation'
        }
      },
      {
        path: 'pending',
        component: PendingComponent,
        data: {
          title: 'Pending Approval'
        }
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PayrollRoutingModule {
}
