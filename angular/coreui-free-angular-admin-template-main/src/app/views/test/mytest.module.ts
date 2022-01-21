import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { CardModule, GridModule, NavModule, UtilitiesModule, TabsModule } from '@coreui/angular';
import { IconModule } from '@coreui/icons-angular';

import { MyTestComponent } from './mytest.component';

// Theme Routing
import { MyTestRoutingModule } from './mytest-routing.module';

@NgModule({
  imports: [
    CommonModule,
    MyTestRoutingModule,
    CardModule,
    GridModule,
    UtilitiesModule,
    IconModule,
    NavModule,
    TabsModule
  ],
  declarations: [ MyTestComponent,
  ]
})
export class MyTestModule {
}
