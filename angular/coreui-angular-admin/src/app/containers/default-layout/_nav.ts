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

];
