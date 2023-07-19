package iim.orangina.studentapi.repository;

import iim.orangina.studentapi.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findStudentByContractOrJobsOrYearOrActivities(String contract, String jobs, String year, String activities);
}