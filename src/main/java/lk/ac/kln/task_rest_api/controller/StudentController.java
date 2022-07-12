package lk.ac.kln.task_rest_api.controller;

import lk.ac.kln.task_rest_api.model.Student;
import lk.ac.kln.task_rest_api.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @GetMapping("/get-student")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<> (studentServices.getAllStudent(),HttpStatus.OK);
    }

    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@Valid @RequestBody Student student){
        return new ResponseEntity<> (studentServices.addStudent(student),HttpStatus.OK);
    }
}
