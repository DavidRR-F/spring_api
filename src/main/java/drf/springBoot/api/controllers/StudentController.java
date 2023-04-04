package drf.springBoot.api.controllers;

import drf.springBoot.api.student.Student;
import drf.springBoot.api.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping()
    public void saveStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }

}
