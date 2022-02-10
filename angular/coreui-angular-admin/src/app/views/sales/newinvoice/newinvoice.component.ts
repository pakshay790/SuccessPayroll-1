import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-newinvoice',
  templateUrl: './newinvoice.component.html',
  styleUrls: ['./newinvoice.component.scss']
})
export class NewinvoiceComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  // goToPage(PageName:string):void{
  //   this.router.navigate([`${'/newinvoice'}`])
  // }

}
