import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/Models/employee';
import { EmployeeService } from 'src/app/Services/employee.service';

@Component({
  selector: 'app-all-employees',
  templateUrl: './all-employees.component.html',
  styleUrls: ['./all-employees.component.css']
})
export class AllEmployeesComponent implements OnInit {
employees:Employee[]



  constructor(private myservice:EmployeeService ){}
  ngOnInit(): void {
      this.myservice.allEmployee().subscribe(data=>{
        this.employees=data
      })
  }

}
