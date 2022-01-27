import { Component, OnInit } from '@angular/core';
import { Employee} from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.scss']
})
export class EmployeeListComponent implements OnInit {

  employees!: Employee[];

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.getEmployees();

   /* this.employees = [{
      "id" : 6,
      "employeeCode" : "S6833949I",
      "nameChinese" : "EMPLOYEE KEE",
      "address2" : "Upper Aljunied Link", 
      "postCode" : "367903"
    }, {
      "id" : 7,
      "employeeCode" : "403509124",
      "nameChinese" : "EMPLOYEE GA1",
      "address2" : "Upper Aljunied Link", 
      "postCode" : "367903"
    }] */
  }

  private getEmployees(){
    this.employeeService.getEmployeesList().subscribe(data =>{
      this.employees = data;
    })
  }

}
