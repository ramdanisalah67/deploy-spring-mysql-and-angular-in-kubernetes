package com.example.StudentApp.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student/")
public class StudentController {


    @GetMapping("welcome")
    public String welcome(){
        return "welcome Student to your spring boot app kubernetes";
    }

}
