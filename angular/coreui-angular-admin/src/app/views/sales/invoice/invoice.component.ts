import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.scss']
})
export class InvoiceComponent implements OnInit {
visible = false;
  constructor() { }

  ngOnInit(): void {
  }
  toggleCollapse(): void {
    this.visible = !this.visible;
  }
}
