import { ClassComponent } from './class/class.component';
import { PoliciesComponent } from './policies/policies.component';
import { QuotationsComponent } from './quotations/quotations.component';


import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';





const routes: Routes = [
  {
    path: '',
    data: {
      title: '',
    },
    children: [
      {
        path: 'quotations',
        component: QuotationsComponent,
        data: {
          title: 'Quotations',
        },
      },
      {
        path: 'policies',
        component: PoliciesComponent,
        data: {
          title: 'Policies',
        },
      },
      {
        path: 'class',
        component: ClassComponent,
        data: {
          title: 'CLass',
        },
      },
    ],
  },

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class InsuranceRoutingModule {}