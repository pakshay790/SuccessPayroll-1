import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { cilArrowThickRight, cilCart, cilPlus } from '@coreui/icons';

@Component({
  selector: 'app-newinvoice',
  templateUrl: './newinvoice.component.html',
  styleUrls: ['./newinvoice.component.scss']
})
export class NewinvoiceComponent implements OnInit {
  icons = { cilPlus,cilArrowThickRight,cilCart};
  notEditMode = true;
  constructor() { }

  ngOnInit(): void {
  }
  // goToPage(PageName:string):void{
  //   this.router.navigate([`${'/newinvoice'}`])
  // }
  onTogglenotEditMode() {
    this.notEditMode = !this.notEditMode;
  }
}
