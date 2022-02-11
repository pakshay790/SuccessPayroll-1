import { UploadbankstmtComponent } from './uploadbankstmt/uploadbankstmt.component';
import { JournalvoucherComponent } from './journalvoucher/journalvoucher.component';
import { MiscpaymentComponent } from './miscpayment/miscpayment.component';
import { MiscreceiptComponent } from './miscreceipt/miscreceipt.component';

import { NewotherpaymentComponent } from './newotherpayment/newotherpayment.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { TransactionsComponent } from './transactions/transactions.component';
import { ReconciliationComponent } from './reconciliation/reconciliation.component';
import { CoaComponent } from './coa/coa.component';



const routes: Routes = [
  {
    path: '',
    data: {
      title: '',
    },
    children: [
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

      {
        path: 'miscpayment',
        component: MiscpaymentComponent,
        data: {
          title: 'Misc Payment',
        },
      },
      {
        path: 'newmiscpayment',
        component: MiscpaymentComponent,
        data: {
          title: 'New Misc Payment',
        },
      },
      {
        path: 'miscreceipt',
        component: MiscreceiptComponent,
        data: {
          title: 'Misc Receipt',
        },
      },
      {
        path: 'newmiscreceipt',
        component: MiscreceiptComponent,
        data: {
          title: 'New Misc Receipt',
        },
      },
      {
        path: 'journalvoucher',
        component: JournalvoucherComponent,
        data: {
          title: 'New Journal Voucher',
        },
      },
      {
        path: 'otherpayment',
        component: NewotherpaymentComponent,
        data: {
          title: 'New Other Payment',
        },
      },
      {
        path: 'uploadbankstmt',
        component: UploadbankstmtComponent,
        data: {
          title: 'Upload Bank Statement',
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