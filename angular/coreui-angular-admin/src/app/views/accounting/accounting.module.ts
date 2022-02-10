import { NewotherpaymentComponent } from './newotherpayment/newotherpayment.component';
import { UploadbankstmtComponent } from './uploadbankstmt/uploadbankstmt.component';
import { JournalvoucherComponent } from './journalvoucher/journalvoucher.component';
import { MiscreceiptComponent } from './miscreceipt/miscreceipt.component';
import { AccoutingRoutingModule } from './accounting-routing.module';
import { ReconciliationComponent } from './reconciliation/reconciliation.component';
import { CoaComponent } from './coa/coa.component';
import { TransactionsComponent } from './transactions/transactions.component';

import { ComponentsModule } from '../../../components/components.module';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { OffcanvasModule } from '@coreui/angular';

// CoreUI Modules
import {
    AccordionModule,
    BadgeModule,
    BreadcrumbModule,
    ButtonModule,
    CardModule,
    CarouselModule,
    CollapseModule,
    DropdownModule,
    FormModule,
    GridModule,
    ListGroupModule,
    NavModule,
    PaginationModule,
    PopoverModule,
    ProgressModule,
    SharedModule,
    SpinnerModule,
    TableModule,
    TabsModule,
    TooltipModule,
    UtilitiesModule,
    
  } from '@coreui/angular';
  
  import { IconModule } from '@coreui/icons-angular';
import { MiscpaymentComponent } from './miscpayment/miscpayment.component';



 

@NgModule({
    imports :[
        CommonModule,
        AccoutingRoutingModule,
        ReactiveFormsModule,
        ComponentsModule,AccordionModule,
        BadgeModule,
        BreadcrumbModule,
        ButtonModule,
        CardModule,
        CollapseModule,
        GridModule,
        UtilitiesModule,
        SharedModule,
        ListGroupModule,
        IconModule,
        ListGroupModule,
        ProgressModule,
        SpinnerModule,
        TabsModule,
        NavModule,
        TooltipModule,
        CarouselModule,
        FormModule,
        ReactiveFormsModule,
        DropdownModule,
        PaginationModule,
        PopoverModule,
        TableModule,
        OffcanvasModule

    ],
    declarations :[
        TransactionsComponent,
        ReconciliationComponent,
        CoaComponent,
        MiscreceiptComponent,
        MiscpaymentComponent,
        JournalvoucherComponent,
        UploadbankstmtComponent,
        NewotherpaymentComponent,
        
    ],
})

export class AccountingModule {
}