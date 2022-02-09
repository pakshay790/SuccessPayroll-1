import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { cilList, cilPlus, cilSettings, cilShare, cilShareBoxed, cilShieldAlt } from '@coreui/icons';

@Component({
  selector: 'app-quotation',
  templateUrl: './quotation.component.html',
  styleUrls: ['./quotation.component.scss']
})
export class QuotationComponent implements OnInit {
  icons = { cilList, cilShieldAlt,cilSettings,cilShare,cilPlus,cilShareBoxed };
  visible = false;
  constructor(private router: Router) { }

  ngOnInit(): void {
    
  }
  goToPage(PageName:string):void{
    this.router.navigate([`${'/newquote'}`])
  }
  toggleCollapse(): void {
    this.visible = !this.visible;
  }

}
