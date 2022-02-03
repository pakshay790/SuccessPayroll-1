import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { InvoiceComponent } from './invoice/invoice.component';
import { QuotationComponent } from './quotation/quotation.component';

const routes: Routes = [{
  path: '',
  data: {
    title: 'Sales',
  },
  children: [
    {
      path: '',
      redirectTo: 'cards',
    },
    {
      path: 'quotation',
      component: QuotationComponent,
      data: {
        title: 'Quotation',
      },
    },
    {
      path: 'invoice',
      component: InvoiceComponent,
      data: {
        title: 'Invoice',
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