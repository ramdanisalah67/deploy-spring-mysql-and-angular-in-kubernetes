import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllEmployeesComponent } from './Components/all-employees/all-employees.component';
import { AddEmpComponent } from './Components/add-emp/add-emp.component';
import { WelcomeComponent } from './Components/welcome/welcome.component';
import { TestComponent } from './test/test.component';
import { AllPostComponent } from './Components/all-post/all-post.component';

const routes: Routes = [
  {
    path:'all',component:AllEmployeesComponent
  },
  {
    path:'add',component:AddEmpComponent
  },
  {
    path:'welcome',component:WelcomeComponent
  },
  {
    path:'test',component:TestComponent
  }, {
    path:'posts',component:AllPostComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
