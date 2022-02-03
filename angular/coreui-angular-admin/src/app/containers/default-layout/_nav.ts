import { INavData } from '@coreui/angular';

export const navItems: INavData[] = [
  {
    
    name: 'Dashboard',
    url: '/dashboard',
    iconComponent: { name: 'cil-speedometer' },
    
  },
  {
    title: true,
    name: 'Accounting',
  },
  {
    name: 'Transactions',
    url: '/accounting/transactions',
    linkProps: { fragment: 'someAnchor' },
    iconComponent: { name: 'cil-credit-card' }
  },
  {
    name: 'Reconciliation',
    url: '/accounting/recon',
    linkProps: { fragment: 'someAnchor' },
    iconComponent: { name: 'cil-notes' }
  },
  {
    name: 'Chart of Accounts',
    url: '/accounting/coa',
    linkProps: { fragment: 'someAnchor' },
    iconComponent: { name: 'cil-chart-pie' }
  },
  {
    name: 'Sales',
    url: '/sales',
    iconComponent: { name: 'cil-Basket' },
    children: [
      {
        name: 'Quotations',
       
        url: '/sales/quotation'
      },
      {
        name: 'Invoices',
        url: '/sales/invoice'
      },
      {
        name: 'Reccuring Invoices',
        url: '/sales/reccuring'
      },
      {
        name: 'Customer Statements',
        url: '/sales/customerstatements '
      },
      {
        name: 'Customers',
        url: '/sales/customer'
      },
      {
        name: 'Products & Services',
        url: '/sales/product'
      },
      {
        name: 'Purchases',
        url: '/purchases',
        iconComponent: { name: 'cil-Tags' },
        children: [
          {
            name: '',
           
            url: '/sales/quotation'
          },
        ]
      }
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
