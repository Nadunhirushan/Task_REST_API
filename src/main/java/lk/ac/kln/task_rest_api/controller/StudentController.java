package lk.ac.kln.task_rest_api.controller;

import lk.ac.kln.task_rest_api.model.Student;
import lk.ac.kln.task_rest_api.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @GetMapping("/get-student")
    public List<Student> getStudent(){
        return studentServices.getStudent();
    }

    @PostMapping("/add-student")
    public String addStudent(@RequestBody Student student){
        return studentServices.addStudent(student);
    }
}
