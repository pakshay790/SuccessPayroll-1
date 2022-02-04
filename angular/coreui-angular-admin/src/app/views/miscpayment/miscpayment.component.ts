import { Component, OnInit } from '@angular/core';

import { IconSetService } from '@coreui/icons-angular';
import { cilListNumbered, cilPaperPlane, brandSet } from '@coreui/icons';

@Component({
  selector: 'app-miscpayment',
  templateUrl: './miscpayment.component.html',
  styleUrls: ['./miscpayment.component.scss']
})
export class MiscpaymentComponent implements OnInit {

  public show:boolean = false;
  public buttonName:any = 'Show';
  constructor(
    public iconSet: IconSetService
  ){
    iconSet.icons = { cilListNumbered, cilPaperPlane, ...brandSet };
  }

  ngOnInit(): void {
  }
  toggle() {
    this.show = !this.show;

    // CHANGE THE NAME OF THE BUTTON.
    if(this.show)  
      this.buttonName = "Hide";
    else
      this.buttonName = "Show";
  }
}