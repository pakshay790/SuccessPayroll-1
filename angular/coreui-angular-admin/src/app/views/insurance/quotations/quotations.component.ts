import { Component, OnInit } from '@angular/core';
import { cilPlus, cilLevelUp,cilCog} from '@coreui/icons';


@Component({
  selector: 'app-quotations',
  templateUrl: './quotations.component.html',
  styleUrls: ['./quotations.component.scss']
})
export class QuotationsComponent implements OnInit {

  icons = {cilPlus,cilLevelUp,cilCog};

  constructor() { }

  ngOnInit(): void {
  }

}
