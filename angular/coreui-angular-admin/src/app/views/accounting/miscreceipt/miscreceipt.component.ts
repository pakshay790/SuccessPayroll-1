import { Component, OnInit } from '@angular/core';

import { cilArrowCircleLeft} from '@coreui/icons';

@Component({
  selector: 'app-miscreceipt',
  templateUrl: './miscreceipt.component.html',
  styleUrls: ['./miscreceipt.component.scss']
})
export class MiscreceiptComponent implements OnInit {
  icons = { cilArrowCircleLeft};

  constructor() { }

  ngOnInit(): void {
  }

}