import { MiscpaymentComponent } from './miscpayment.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  {
    path: '',
    component: MiscpaymentComponent,
    data: {
      title: 'Misc Payment'
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MiscpaymentRoutingModule {
}
