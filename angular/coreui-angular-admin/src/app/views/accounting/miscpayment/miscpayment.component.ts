import { Component, OnInit, } from '@angular/core';

import { cilArrowCircleLeft} from '@coreui/icons';

@Component({
  selector: 'app-miscpayment',
  templateUrl: './miscpayment.component.html',
  styleUrls: ['./miscpayment.component.scss']
})
export class MiscpaymentComponent implements OnInit {
  notEditMode = true;
  icons = { cilArrowCircleLeft};
  constructor() { }

  ngOnInit(): void {
  }

  onTogglenotEditMode() {

    if (this.notEditMode = true) {

      this.notEditMode = !this.notEditMode;
      
    }
    
  }
}
