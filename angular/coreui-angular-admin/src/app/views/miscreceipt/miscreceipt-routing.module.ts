import { MiscreceiptComponent } from './miscreceipt.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  {
    path: '',
    component: MiscreceiptComponent,
    data: {
      title: 'Misc Receipt'
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MiscReceiptRoutingModule {
}