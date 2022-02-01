
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { TransactionsComponent } from './transactions/transactions.component';
import { ReconciliationComponent } from './reconciliation/reconciliation.component';
import { CoaComponent } from './coa/coa.component';


const routes: Routes = [
  {
    path: '',
    data: {
      title: 'Accounting',
    },
    children: [
      {
        path: '',
        redirectTo: 'cards',
      },
      {
        path: 'transactions',
        component: TransactionsComponent,
        data: {
          title: 'Transactions',
        },
      },
      {
        path: 'recon',
        component: ReconciliationComponent,
        data: {
          title: 'Reconciliaton',
        },
      },
      {
        path: 'coa',
        component: CoaComponent,
        data: {
          title: 'Chart of Accounts',
        },
      },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AccoutingRoutingModule {}

