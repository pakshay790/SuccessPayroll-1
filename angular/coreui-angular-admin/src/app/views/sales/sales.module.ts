import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SalesRoutingModule } from './sales-routing.module';
import { QuotationComponent } from './quotation/quotation.component';

import { InvoiceComponent } from './invoice/invoice.component';


@NgModule({
  declarations: [
    QuotationComponent,
   
    InvoiceComponent
  ],
  imports: [
    CommonModule,
    SalesRoutingModule
  ]
})
export class SalesModule { }
