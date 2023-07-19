package iim.orangina.studentapi.controller;

import iim.orangina.studentapi.model.Student;
import iim.orangina.studentapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getStudentByTags(
            @RequestParam(required = false) String contract,
            @RequestParam(required = false) String jobs,
            @RequestParam(required = false) String year,
            @RequestParam(required = false) String activities
    ) {
        return studentService.getByTags(contract, jobs, year, activities);
    }

    @PostMapping
    public void setStudentData(
            @RequestBody List<Student> studentList
    ) {
        studentService.setStudentData(studentList);
    }
}
