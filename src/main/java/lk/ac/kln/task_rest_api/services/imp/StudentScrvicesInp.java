package lk.ac.kln.task_rest_api.services.imp;

import lk.ac.kln.task_rest_api.model.Student;
import lk.ac.kln.task_rest_api.repository.StudentRepository;
import lk.ac.kln.task_rest_api.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScrvicesInp implements StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudent() {
        List<Student> allStudent = studentRepository.findAll();
        return allStudent;
    }

    @Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Recode added successfully!";
    }
}
