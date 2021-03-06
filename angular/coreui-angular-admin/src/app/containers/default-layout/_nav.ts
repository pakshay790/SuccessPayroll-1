import { INavData } from '@coreui/angular';
import { cilPlus, cilShieldAlt } from '@coreui/icons';

export const navItems: INavData[] = [
  {
    name: 'Dashboard',
    url: '/home',
    iconComponent: { name: 'cil-speedometer' },
  },
  {
    name: 'Insurance',
    url: '/insurance',
    iconComponent: { name: 'cilShieldAlt'},
    children: [
      {
        name: 'Quotations',
       
        url: '/insurance/quotations'
      },
      {
        name: 'Policies',
        url: '/insurance/policies'
      },
      {
        name: 'Class',
        url: '/insurance/class'
      },
    ]
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
        name: 'My HR',
        url: '/payroll/payroll-dashboard',
      },
      /*{
        name: 'Employees',
        url: '/payroll/employee',
      },
      {
        name: 'Apply Vacation',
        url: '/payroll/vacation',
      },
      {
        name: 'Pending Approval',
        url: '/payroll/pending',
      },*/
      {
        name: 'Team Management',
        url: '/payroll/myteam-management',
      },
      {
        name: 'Run Payroll',
        url: '/payroll/run-payroll',
      },
    ]
  },
  {
    name: 'Reports',
    url: '/reports',
    iconComponent: { name: 'cil-spreadsheet' },
    
  },
];
  
  // {
  //   name: 'Dashboard',
  //   url: '/dashboard',
  //   iconComponent: { name: 'cil-speedometer' },
  //   badge: {
  //     color: 'info',
  //     text: 'NEW'
  //   }
  // },
  // {
  //   title: true,
  //   name: 'Theme'
  // },
  // {
  //   name: 'Colors',
  //   url: '/theme/colors',
  //   iconComponent: { name: 'cil-drop' }
  // },
  // {
  //   name: 'Typography',
  //   url: '/theme/typography',
  //   linkProps: { fragment: 'someAnchor' },
  //   iconComponent: { name: 'cil-pencil' }
  // },
  // {
  //   name: 'Employees',
  //   url: '/theme/Test',
  //   linkProps: { fragment: 'someAnchor' },
  //   iconComponent: { name: 'cil-pencil' }
  // },
  // {
  //   name: 'Components',
  //   title: true
  // },
  // {
  //   name: 'Base',
  //   url: '/base',
  //   iconComponent: { name: 'cil-puzzle' },
  //   children: [
  //     {
  //       name: 'Accordion',
  //       url: '/base/accordion'
  //     },
  //     {
  //       name: 'Breadcrumbs',
  //       url: '/base/breadcrumbs'
  //     },
  //     {
  //       name: 'Cards',
  //       url: '/base/cards'
  //     },
  //     {
  //       name: 'Carousel',
  //       url: '/base/carousel'
  //     },
  //     {
  //       name: 'Collapse',
  //       url: '/base/collapse'
  //     },
  //     {
  //       name: 'List Group',
  //       url: '/base/list-group'
  //     },
  //     {
  //       name: 'Navs & Tabs',
  //       url: '/base/navs'
  //     },
  //     {
  //       name: 'Pagination',
  //       url: '/base/pagination'
  //     },
  //     {
  //       name: 'Popovers',
  //       url: '/base/popovers'
  //     },
  //     {
  //       name: 'Progress',
  //       url: '/base/progress'
  //     },
  //     {
  //       name: 'Spinners',
  //       url: '/base/spinners'
  //     },
  //     {
  //       name: 'Tables',
  //       url: '/base/tables'
  //     },
  //     {
  //       name: 'Tabs',
  //       url: '/base/tabs'
  //     },
  //     {
  //       name: 'Tooltips',
  //       url: '/base/tooltips'
  //     }
  //   ]
  // },
  // {
  //   name: 'Buttons',
  //   url: '/buttons',
  //   iconComponent: { name: 'cil-cursor' },
  //   children: [
  //     {
  //       name: 'Buttons',
  //       url: '/buttons/buttons'
  //     },
  //     {
  //       name: 'Button groups',
  //       url: '/buttons/button-groups'
  //     },
  //     {
  //       name: 'Dropdowns',
  //       url: '/buttons/dropdowns'
  //     },
  //   ]
  // },
  // {
  //   name: 'Forms',
  //   url: '/forms',
  //   iconComponent: { name: 'cil-notes' },
  //   children: [
  //     {
  //       name: 'Form Control',
  //       url: '/forms/form-control'
  //     },
  //     {
  //       name: 'Select',
  //       url: '/forms/select'
  //     },
  //     {
  //       name: 'Checks & Radios',
  //       url: '/forms/checks-radios'
  //     },
  //     {
  //       name: 'Range',
  //       url: '/forms/range'
  //     },
  //     {
  //       name: 'Input Group',
  //       url: '/forms/input-group'
  //     },
  //     {
  //       name: 'Floating Labels',
  //       url: '/forms/floating-labels'
  //     },
  //     {
  //       name: 'Layout',
  //       url: '/forms/layout'
  //     },
  //     {
  //       name: 'Validation',
  //       url: '/forms/validation'
  //     }
  //   ]
  // },
  // {
  //   name: 'Charts',
  //   url: '/charts',
  //   iconComponent: { name: 'cil-chart-pie' }
  // },
  // {
  //   name: 'Icons',
  //   iconComponent: { name: 'cil-star' },
  //   url: '/icons',
  //   children: [
  //     {
  //       name: 'CoreUI Free',
  //       url: '/icons/coreui-icons',
  //       badge: {
  //         color: 'success',
  //         text: 'FREE'
  //       }
  //     },
  //     {
  //       name: 'CoreUI Flags',
  //       url: '/icons/flags'
  //     },
  //     {
  //       name: 'CoreUI Brands',
  //       url: '/icons/brands'
  //     }
  //   ]
  // },
  // {
  //   name: 'Notifications',
  //   url: '/notifications',
  //   iconComponent: { name: 'cil-bell' },
  //   children: [
  //     {
  //       name: 'Alerts',
  //       url: '/notifications/alerts'
  //     },
  //     {
  //       name: 'Badges',
  //       url: '/notifications/badges'
  //     },
  //     {
  //       name: 'Modal',
  //       url: '/notifications/modal'
  //     },
  //     {
  //       name: 'Toast',
  //       url: '/notifications/toasts'
  //     }
  //   ]
  // },
  // {
  //   name: 'Widgets',
  //   url: '/widgets',
  //   iconComponent: { name: 'cil-calculator' },
  //   badge: {
  //     color: 'info',
  //     text: 'NEW'
  //   }
  // },
  // {
  //   title: true,
  //   name: 'Extras'
  // },
  // {
  //   name: 'Pages',
  //   url: '/login',
  //   iconComponent: { name: 'cil-star' },
  //   children: [
  //     {
  //       name: 'Login',
  //       url: '/login'
  //     },
  //     {
  //       name: 'Register',
  //       url: '/register'
  //     },
  //     {
  //       name: 'Error 404',
  //       url: '/404'
  //     },
  //     {
  //       name: 'Error 500',
  //       url: '/500'
  //     }
  //   ]
  // },
