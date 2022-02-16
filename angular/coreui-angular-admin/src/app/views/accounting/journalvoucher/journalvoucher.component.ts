import { Component, OnInit } from '@angular/core';

import { cilArrowCircleLeft} from '@coreui/icons';

@Component({
  selector: 'app-journalvoucher',
  templateUrl: './journalvoucher.component.html',
  styleUrls: ['./journalvoucher.component.scss']
})
export class JournalvoucherComponent implements OnInit {
  icons = { cilArrowCircleLeft};

  constructor() { }

  ngOnInit(): void {
  }

}
