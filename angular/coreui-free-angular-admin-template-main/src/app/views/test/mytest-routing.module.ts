import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { MyTestComponent } from './mytest.component';

const routes: Routes = [
  {
    path: '',
    data: {
      title: 'Test Page',
    },
    children: [
      {
        path: 'mytest',
        component: MyTestComponent,
        data: {
          title: 'Employees',
        },
      },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MyTestRoutingModule {} 