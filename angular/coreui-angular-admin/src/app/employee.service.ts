import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  
  /*private baseURL = "http://localhost:8026/api/getAllEmployees"; */
   
   private baseURL = "http://localhost:8026/api/getEmployeeDetailsFromEmployeeCode/employeeCode=S1155047I"; 
  
  /* private baseURL = "http://localhost:3000/api/getEmployeeDetailsFromEmployeeCode/employeeCode=S1155047I"; */

  constructor(private httpClient: HttpClient) { }
  
  getEmployeesList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }
}
