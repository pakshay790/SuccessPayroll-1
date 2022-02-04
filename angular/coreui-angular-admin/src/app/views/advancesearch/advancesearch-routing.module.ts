import { AdvancesearchComponent } from './advancesearch.component';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';




const routes: Routes = [
  {
    path: '',
    component: AdvancesearchComponent,
    data: {
      title: 'advancesearch'
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdvancesearchRoutingModule {
}
