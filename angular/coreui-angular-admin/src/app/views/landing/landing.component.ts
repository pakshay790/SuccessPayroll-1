import { Component, OnInit } from '@angular/core';
import { cilList, cilPlus, cilSettings, cilShare, cilShareBoxed, cilShieldAlt,cilCloudUpload} from '@coreui/icons';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.scss']
})
export class LandingComponent implements OnInit {

  constructor() { }
  icons = { cilList, cilShieldAlt,cilSettings,cilShare,cilPlus,cilShareBoxed,cilCloudUpload };


  ngOnInit(): void {
  }

}
