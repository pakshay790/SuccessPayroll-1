import { Component, OnInit } from '@angular/core';
import { cilList, cilPlus, cilSettings, cilShare, cilShareBoxed, 
  cilShieldAlt,cilCloudUpload, cilMoney, cilNotes, cilNoteAdd,
  cilCart} from '@coreui/icons';
import { freeSet } from '@coreui/icons/js/free';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.scss']
})
export class LandingComponent implements OnInit {

  constructor() { }
  icons = { cilList, cilShieldAlt,cilSettings,cilShare,cilPlus,cilShareBoxed,
    cilCloudUpload, cilMoney, freeSet, cilNotes, cilNoteAdd, cilCart };


  ngOnInit(): void {
  }

}
