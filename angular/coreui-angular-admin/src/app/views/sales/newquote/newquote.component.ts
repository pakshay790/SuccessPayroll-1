import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { cilArrowThickRight, cilPlus, cilCart } from '@coreui/icons';

@Component({
  selector: 'app-newquote',
  templateUrl: './newquote.component.html',
  styleUrls: ['./newquote.component.scss']
})
export class NewquoteComponent implements OnInit {
  icons = { cilPlus,cilArrowThickRight,cilCart};
  isShow = false;
  notEditMode = true;
  constructor() { }

  ngOnInit(): void {
  }
  // goToPage(PageName:string):void{
  //   this.router.navigate([`${'/newquote'}`])
  // }
  
  toggleShow() {
    this.isShow = !this.isShow;
  }
  onTogglenotEditMode() {
    this.notEditMode = !this.notEditMode;
  }
}
