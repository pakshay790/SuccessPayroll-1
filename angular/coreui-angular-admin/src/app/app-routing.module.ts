import { ReportModule } from './views/reports/report.module';
import { JournalVoucherModule } from './views/journalvoucher/journalvoucher.module';




import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DefaultLayoutComponent } from './containers';
import { Page404Component } from './views/pages/page404/page404.component';
import { Page500Component } from './views/pages/page500/page500.component';
import { LoginComponent } from './views/pages/login/login.component';
import { RegisterComponent } from './views/pages/register/register.component';
import { EmployeeComponent } from './payroll/employee/employee.component';
import { VacationComponent } from './payroll/vacation/vacation.component';
import { PendingComponent } from './payroll/pending/pending.component';
import { PayrollDashboardComponent } from './payroll/payroll-dashboard/payroll-dashboard.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'Landing',
    pathMatch: 'full'
  },
  {
    path: '',
    component: DefaultLayoutComponent,
    data: {
      title: ''
    },
    children: [
      {
        path: 'dashboard',
        loadChildren: () =>
          import('./views/dashboard/dashboard.module').then((m) => m.DashboardModule)
      },
      {
        path: 'Landing',
        loadChildren: () =>
          import('./views/landing/landing.module').then((m) => m.LandingModule)
      },
      {
        path: 'accounting',
        loadChildren: () =>
          import('./views/accounting/accounting.module').then((m) => m.AccountingModule)
      },
      {
        path: 'miscpayment',
        loadChildren: () =>
          import('./views/miscpayment/miscpayment.module').then((m) => m.MiscPaymentModule)
      },
      {
        path: 'miscreceipt',
        loadChildren: () =>
          import('./views/miscreceipt/miscreceipt.module').then((m) => m.MiscReceiptModule)
      },
      {
        path: 'journalvoucher',
        loadChildren: () =>
          import('./views/journalvoucher/journalvoucher.module').then((m) => m.JournalVoucherModule)
      },
      {
        path: 'otherpayment',
        loadChildren: () =>
          import('./views/newotherpayment/newotherpayment.module').then((m) => m.NewOtherPaymentModule)
      },
      {
        path: 'uploadbankstmt',
        loadChildren: () =>
          import('./views/uploadbankstmt/uploadbankstmt.module').then((m) => m.UploadBankStmtModule)
      },
      {
        path: 'reports',
        loadChildren: () =>
          import('./views/reports/report.module').then((m) => m.ReportModule)
      },
      {
        path: 'theme',
        loadChildren: () =>
          import('./views/theme/theme.module').then((m) => m.ThemeModule)
      },
      {
        path: 'base',
        loadChildren: () =>
          import('./views/base/base.module').then((m) => m.BaseModule)
      },
      {
        path: 'buttons',
        loadChildren: () =>
          import('./views/buttons/buttons.module').then((m) => m.ButtonsModule)
      },
      {
        path: 'forms',
        loadChildren: () =>
          import('./views/forms/forms.module').then((m) => m.CoreUIFormsModule)
      },
      {
        path: 'charts',
        loadChildren: () =>
          import('./views/charts/charts.module').then((m) => m.ChartsModule)
      },
      {
        path: 'icons',
        loadChildren: () =>
          import('./views/icons/icons.module').then((m) => m.IconsModule)
      },
      {
        path: 'notifications',
        loadChildren: () =>
          import('./views/notifications/notifications.module').then((m) => m.NotificationsModule)
      },
      {
        path: 'widgets',
        loadChildren: () =>
          import('./views/widgets/widgets.module').then((m) => m.WidgetsModule)
      },
      {
        path: 'pages',
        loadChildren: () =>
          import('./views/pages/pages.module').then((m) => m.PagesModule)
      },
      {
        path: 'payroll',
        loadChildren: () =>
          import('./payroll/payroll.module').then((m) => m.PayrollModule)
      },
      {
        path: 'sales',
        loadChildren: () =>
          import('./views/sales/sales.module').then((m) => m.SalesModule)
      },
      {
        path: 'newquote',
        loadChildren: () =>
          import('./views/newquote/newquote.module').then((m) => m.NewquoteModule)
      },
      {
        path: 'advancesearch',
        loadChildren: () =>
          import('./views/advancesearch/advancesearch.module').then((m) => m.AdvancesearchModule)
      },
    ]
  },
  {
    path: '404',
    component: Page404Component,
    data: {
      title: 'Page 404'
    }
  },
  {
    path: '500',
    component: Page500Component,
    data: {
      title: 'Page 500'
    }
  },
  {
    path: 'login',
    component: LoginComponent,
    data: {
      title: 'Login Page'
    }
  },
  {
    path: 'register',
    component: RegisterComponent,
    data: {
      title: 'Register Page'
    }
  },
  
  {path: '**', redirectTo: 'Landing'}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, {
      scrollPositionRestoration: 'top',
      anchorScrolling: 'enabled',
      initialNavigation: 'enabledBlocking'
      // relativeLinkResolution: 'legacy'
    })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}