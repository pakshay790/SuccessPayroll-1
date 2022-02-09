import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { cilList, cilPlus, cilSettings, cilShare, cilShareBoxed, cilShieldAlt } from '@coreui/icons';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.scss']
})
export class InvoiceComponent implements OnInit {
  icons = { cilList, cilShieldAlt,cilSettings,cilShare,cilPlus,cilShareBoxed };
visible = false;
  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  toggleCollapse(): void {
    this.visible = !this.visible;
  }
  goToPage(PageName:string):void{
    this.router.navigate([`${'/newinvoice'}`])
  }
}
