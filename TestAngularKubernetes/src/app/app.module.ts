import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AllEmployeesComponent } from './Components/all-employees/all-employees.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddEmpComponent } from './Components/add-emp/add-emp.component';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { WelcomeComponent } from './Components/welcome/welcome.component';
import { TestComponent } from './test/test.component';
import { AllPostComponent } from './Components/all-post/all-post.component';

@NgModule({
  declarations: [
    AppComponent,
    AllEmployeesComponent,
    AddEmpComponent,
    WelcomeComponent,
    TestComponent,
    AllPostComponent,
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule 
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
