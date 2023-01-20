package com.pwick.TestBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


//    private StudentRepository studentRepository;

//    @Autowired
//    public StudentController(StudentRepository studentRepository){
//        this.studentRepository = studentRepository;
//    }

    @GetMapping("/student")
    public String getStudent(){
        return "Nimal, 17, 24";
    }

//    @PostMapping("/student")
//    public void addStudent(@RequestBody Student studentData){
//        studentRepository.save(studentData);
//
//    }

}
