import { NewotherpaymentComponent } from './newotherpayment.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  {
    path: '',
    component: NewotherpaymentComponent,
    data: {
      title: 'New Other Payment'
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NewOtherPaymentRoutingModule {
}
