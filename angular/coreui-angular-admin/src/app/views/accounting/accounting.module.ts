import { AccoutingRoutingModule } from './accounting-routing.module';
import { ReconciliationComponent } from './reconciliation/reconciliation.component';
import { CoaComponent } from './coa/coa.component';
import { TransactionsComponent } from './transactions/transactions.component';


import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

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

 

@NgModule({
    imports :[
        CommonModule,
        AccoutingRoutingModule,
    ],
    declarations :[
        TransactionsComponent,
        ReconciliationComponent,
        CoaComponent,
    ],
})

export class AccountingModule {
}