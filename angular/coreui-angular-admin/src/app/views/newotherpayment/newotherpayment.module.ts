import { NewOtherPaymentRoutingModule } from './newotherpayment-routing.module';
import { NewotherpaymentComponent } from './newotherpayment.component';


import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';

import {
  AvatarModule,
  ButtonGroupModule,
  ButtonModule,
  CardModule,
  FormModule,
  GridModule,
  NavModule,
  OffcanvasModule,
  ProgressModule,
  TableModule,
  TabsModule
} from '@coreui/angular';
import { IconModule } from '@coreui/icons-angular';
import { ChartjsModule } from '@coreui/angular-chartjs';

import { WidgetsModule } from '../widgets/widgets.module';

@NgModule({
  imports: [
    NewOtherPaymentRoutingModule,
    CardModule,
    NavModule,
    IconModule,
    TabsModule,
    CommonModule,
    GridModule,
    ProgressModule,
    ReactiveFormsModule,
    ButtonModule,
    FormModule,
    ButtonModule,
    ButtonGroupModule,
    ChartjsModule,
    AvatarModule,
    TableModule,OffcanvasModule,
    WidgetsModule
  ],
  declarations: [NewotherpaymentComponent]
})
export class NewOtherPaymentModule {
}
