import { Component } from '@angular/core';
import { Employee } from 'src/app/Models/employee';
import { EmployeeService } from 'src/app/Services/employee.service';

@Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css']
})
export class AddEmpComponent {
e:Employee= new Employee()

constructor(private myservice:EmployeeService){}

  ajouterEmployee(){
    this.myservice.ajouterEmployee(this.e)
    console.log(this.e)
  }
}
