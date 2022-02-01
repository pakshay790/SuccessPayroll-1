import { AccoutingRoutingModule } from './accounting-routing.module';
import { ReconciliationComponent } from './reconciliation/reconciliation.component';
import { CoaComponent } from './coa/coa.component';
import { TransactionsComponent } from './transactions/transactions.component';

import { ComponentsModule } from '../../../components/components.module';
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

    ],
    declarations :[
        TransactionsComponent,
        ReconciliationComponent,
        CoaComponent,
    ],
})

export class AccountingModule {
}