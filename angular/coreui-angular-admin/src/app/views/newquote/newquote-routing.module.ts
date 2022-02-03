import { NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NewquoteComponent } from './newquote.component';



const routes: Routes = [
  {
    path: '',
    component: NewquoteComponent,
    data: {
      title: 'new quote'
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NewquoteRoutingModule {
}