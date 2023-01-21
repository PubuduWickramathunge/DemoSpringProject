package com.pwick.TestBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {


    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id){
        Student student = studentRepository.getReferenceById(id);
        return ResponseEntity.ok(student);

    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student studentData){
        studentRepository.save(studentData);

    }

}
