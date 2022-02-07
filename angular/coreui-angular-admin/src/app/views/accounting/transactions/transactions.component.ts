import { Component } from '@angular/core';

import { IconSetService } from '@coreui/icons-angular';

import { cilCheckAlt,cilListNumbered, cilPaperPlane, brandSet } from '@coreui/icons';


@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.scss']
})
export class TransactionsComponent  {

  visible = false;
  constructor() { }

  ngOnInit(): void {
  }

  toggleCollapse(): void {
    this.visible = !this.visible;
  }

}