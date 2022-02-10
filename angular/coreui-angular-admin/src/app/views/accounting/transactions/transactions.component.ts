import { Component } from '@angular/core';

import { IconSetService } from '@coreui/icons-angular';

import { cilCheckAlt,cilListNumbered, cilPaperPlane, brandSet } from '@coreui/icons';

import { cilList, cilPlus, cilSettings, cilShare, cilShareBoxed, cilShieldAlt,cilCloudUpload} from '@coreui/icons';
@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.scss']
})
export class TransactionsComponent  {

  icons = { cilList, cilShieldAlt,cilSettings,cilShare,cilPlus,cilShareBoxed,cilCloudUpload };


  constructor() { }

  ngOnInit(): void {
  }
}