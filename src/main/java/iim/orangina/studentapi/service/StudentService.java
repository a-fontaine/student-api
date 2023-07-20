package iim.orangina.studentapi.service;

import iim.orangina.studentapi.model.Student;
import iim.orangina.studentapi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getByTags(String contract, String jobs, String experience, String activities) {
        return studentRepository.getStudentsByTags(contract, jobs, experience, activities);
    }
}
