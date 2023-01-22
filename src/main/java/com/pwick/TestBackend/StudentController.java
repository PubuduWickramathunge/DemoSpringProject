package com.pwick.TestBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id){
        Student student = studentRepository.findById(id).get();
        return ResponseEntity.ok(student);

    }

    @GetMapping("/student")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student studentData){
        studentRepository.save(studentData);

    }

}
