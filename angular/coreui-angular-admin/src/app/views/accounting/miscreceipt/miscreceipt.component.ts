import { Component, OnInit } from '@angular/core';

import { cilArrowCircleLeft} from '@coreui/icons';

@Component({
  selector: 'app-miscreceipt',
  templateUrl: './miscreceipt.component.html',
  styleUrls: ['./miscreceipt.component.scss']
})
export class MiscreceiptComponent implements OnInit {
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