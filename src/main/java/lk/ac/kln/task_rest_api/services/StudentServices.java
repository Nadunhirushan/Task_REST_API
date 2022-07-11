package lk.ac.kln.task_rest_api.services;

import lk.ac.kln.task_rest_api.model.Student;

import java.util.List;

public interface StudentServices {
    List<Student> getStudent();

    String addStudent(Student student);
}
