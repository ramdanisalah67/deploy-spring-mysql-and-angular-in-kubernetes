import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../Models/employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  api="http://localhost:8085/api/employee/"
  apiPost="http://springboot-crud-svc:8080/api/post/"

  constructor(private http:HttpClient) { }

  ajouterEmployee(e:Employee){
  
    this.http.post(this.api+'add',e)
  }
  allEmployee():Observable<any>{
    return this.http.get(this.api+'all')
  }
  allPost():Observable<any>{
    return this.http.get(this.apiPost+'all')
  }
}
