import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/Services/employee.service';

@Component({
  selector: 'app-all-post',
  templateUrl: './all-post.component.html',
  styleUrls: ['./all-post.component.css']
})
export class AllPostComponent implements OnInit{
 
 constructor(private myService:EmployeeService){}
 

 
  ngOnInit(): void {
   this.myService.allPost().subscribe(data=>{console.log(data)})
  }


}
