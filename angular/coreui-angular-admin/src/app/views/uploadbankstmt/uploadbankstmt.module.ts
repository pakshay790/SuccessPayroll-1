import { UploadbankstmtComponent } from './uploadbankstmt.component';
import { UploadBankStmtRoutingModule } from './uploadbankstmt-routing.module';

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
  TabsModule,
  ListGroupModule,
  BadgeModule ,
  AlertModule,
} from '@coreui/angular';
import { IconModule } from '@coreui/icons-angular';
import { ChartjsModule } from '@coreui/angular-chartjs';

import { WidgetsModule } from '../widgets/widgets.module';

@NgModule({
  imports: [
    UploadBankStmtRoutingModule,
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
    WidgetsModule,
    ListGroupModule,
    BadgeModule,
    FormModule,AlertModule 
  ],
  declarations: [UploadbankstmtComponent]
})
export class UploadBankStmtModule {
}
