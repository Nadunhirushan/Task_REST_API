package lk.ac.kln.task_rest_api.repository;

import lk.ac.kln.task_rest_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
