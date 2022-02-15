

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { InvoiceComponent } from './invoice/invoice.component';
import { NewinvoiceComponent } from './newinvoice/newinvoice.component';
import { NewquoteComponent } from './newquote/newquote.component';
import { QuotationComponent } from './quotation/quotation.component';

const routes: Routes = [{
  path: '',
  data: {
    title: '',
  },
  children: [
    {
      path: 'quotation',
      component: QuotationComponent,
      data: {
        title: 'Quotations',
      },
    },
    {
      path: 'invoice',
      component: InvoiceComponent,
      data: {
        title: 'Invoices',
      },
    },
    {
      path: 'newquote',
      component: NewquoteComponent,
      data: {
        title: 'New Quotation',
      },
    },
    {
      path: 'quote',
      component: NewquoteComponent,
      data: {
        title: 'Quotation',
      },
    },
    {
      path: 'newinvoice',
      component: NewinvoiceComponent,
      data: {
        title: 'New Invoice',
      },
    },
    {
      path: 'addinvoice',
      component: NewinvoiceComponent,
      data: {
        title: 'New Invoice',
      },
    },
   
  ],
},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class SalesRoutingModule { }
