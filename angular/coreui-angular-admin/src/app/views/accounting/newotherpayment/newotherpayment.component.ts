import { Component, OnInit } from '@angular/core';

import { cilArrowCircleLeft} from '@coreui/icons';


@Component({
  selector: 'app-newotherpayment',
  templateUrl: './newotherpayment.component.html',
  styleUrls: ['./newotherpayment.component.scss']
})
export class NewotherpaymentComponent implements OnInit {

  icons = { cilArrowCircleLeft};


  constructor() { }

  ngOnInit(): void {
  }

}
