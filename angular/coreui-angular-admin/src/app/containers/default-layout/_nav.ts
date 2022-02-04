import { INavData } from '@coreui/angular';
import { IconComponent } from '@coreui/icons-angular';

export const navItems: INavData[] = [
  {
    
    name: 'Accounting',
    url: '/accounting',
    iconComponent: { name: 'cil-notes' },
    children: [
      {
        name: 'Transactions',
        url: '/accounting/transactions',
        
      },
      {
        name: 'Reconciliation',
        url: '/accounting/recon',
      },
      {
        name: 'Chart of Accounts',
        url: '/accounting/coa',
      },
    ]
  },
  {
    name: 'Payroll',
    url: '/payroll',
    iconComponent: { name: 'cil-calculator' },
    children: [
      {
        name: 'Dashboard',
        url: '/payroll/payroll-dashboard',
        iconComponent: { name: 'cil-User' },
      },
      {
        name: 'Employees',
        url: '/payroll/employee',
        iconComponent: { name: 'cil-User' },
      },
      {
        name: 'Apply Vacation',
        url: '/payroll/vacation',
        iconComponent: { name: 'cil-Calendar' },
      },
      {
        name: 'Pending Approval',
        url: '/payroll/pending',
        iconComponent: { name: 'cil-bell' },
      }
    ]
  },

];
