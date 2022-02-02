import { Component, OnInit } from '@angular/core';
import { DefaultLayoutComponent} from 'src/app/containers';

@Component({
  selector: 'app-miscpayment',
  templateUrl: './miscpayment.component.html',
  styleUrls: ['./miscpayment.component.scss']
})
export class MiscpaymentComponent implements OnInit {

  public show:boolean = false;
  public buttonName:any = 'Show';
  constructor() { }

  ngOnInit(): void {
  }
  toggle() {
    this.show = !this.show;

    // CHANGE THE NAME OF THE BUTTON.
    if(this.show)  
      this.buttonName = "Hide";
    else
      this.buttonName = "Show";
  }
}
