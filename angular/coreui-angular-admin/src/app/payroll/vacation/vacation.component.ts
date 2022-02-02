import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vacation',
  templateUrl: './vacation.component.html',
  styleUrls: ['./vacation.component.scss']
})
export class VacationComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  
  goToPage(PageName:string):void{
    this.router.navigate([`${'/payroll/pending'}`])
  }
  
  

  onSubmit() {  
    this.router.navigateByUrl('/payroll-dashboard');
} 

}
