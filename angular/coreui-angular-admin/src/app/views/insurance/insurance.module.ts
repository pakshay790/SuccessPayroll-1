

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
import { InsuranceRoutingModule } from './insurance-routing.module';
import { QuotationsComponent } from './quotations/quotations.component';
import { PoliciesComponent } from './policies/policies.component';
import { ClassComponent } from './class/class.component';



 

@NgModule({
    imports :[
        CommonModule,
        InsuranceRoutingModule,
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
    QuotationsComponent,
    PoliciesComponent,
    ClassComponent,
  ],
})

export class InsuranceModule {
}