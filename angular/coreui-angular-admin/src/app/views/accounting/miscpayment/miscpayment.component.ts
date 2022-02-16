import { Component, OnInit, } from '@angular/core';

import { cilArrowCircleLeft} from '@coreui/icons';

@Component({
  selector: 'app-miscpayment',
  templateUrl: './miscpayment.component.html',
  styleUrls: ['./miscpayment.component.scss']
})
export class MiscpaymentComponent implements OnInit {

  icons = { cilArrowCircleLeft};


  constructor() { }

  ngOnInit(): void {
  }
}
