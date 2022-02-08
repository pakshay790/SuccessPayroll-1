import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { EmployeeComponent } from '../payroll/employee/employee.component';
import { VacationComponent } from '../payroll/vacation/vacation.component';
import { PendingComponent } from '../payroll/pending/pending.component';
import { PayrollDashboardComponent } from '../payroll/payroll-dashboard/payroll-dashboard.component';
import { MyTeamManagementComponent } from '../payroll/myteam-management/myteam-management.component';

const routes: Routes = [
  {
    path: '',
    data: {
      title: ''
    },
    children: [
      {
        path: 'payroll-dashboard',
        component: PayrollDashboardComponent,
        data: {
          title: 'My HR'
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
      },
      {
        path: 'myteam-management',
        component: MyTeamManagementComponent,
        data: {
          title: 'Team Management'
        }
      }
    ]
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PayrollRoutingModule {
}