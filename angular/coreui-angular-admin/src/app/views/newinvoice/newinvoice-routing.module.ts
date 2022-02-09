import { NewinvoiceComponent } from './newinvoice.component';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';



const routes: Routes = [
  {
    path: '',
    component: NewinvoiceComponent,
    data: {
      title: 'New Invoice'
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NewinvoiceRoutingModule {
}
