import { Component, OnInit } from '@angular/core';
import { cilList, cilPlus, cilSettings, cilShare, cilShareBoxed, 
  cilShieldAlt, cilArrowThickRight, cilCart } from '@coreui/icons';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {

  icons = { cilList, cilShieldAlt,cilSettings,
    cilShare,cilPlus,cilShareBoxed,cilArrowThickRight, cilCart };
  notEditMode = true;
  visible = false;

  constructor() { }

  ngOnInit(): void {
  }

  onTogglenotEditMode() {
    this.notEditMode = !this.notEditMode;
  }

}
