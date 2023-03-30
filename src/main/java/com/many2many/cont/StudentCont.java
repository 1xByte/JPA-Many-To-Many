package com.many2many.cont;

import com.many2many.model.Course;
import com.many2many.model.Student;
import com.many2many.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentCont {

    @Autowired
    private StudentService studentSetvice;

    @PostMapping(value = "/add")
    public Student addstudent(@RequestBody Student student){
        return studentSetvice.addStudent(student);
    }

    @GetMapping(value = "/get-all")
    public List<Student> getAllinCont(){
        return   studentSetvice.getAll();

    }

//    @GetMapping(value = "/get/{studentName}")
//    public List<Student> getAllByNameInCont(@PathVariable String studentName){
//        return   studentSetvice.getAllByName(studentName);
//
//    }

//    @GetMapping(value = "/get-set/{courseName}/{coursePrice}")
//    public List<Student> getAllByQueryInCont(@PathVariable String courseName, @PathVariable String coursePrice){
//        return   studentSetvice.getAllByquery(courseName,coursePrice);
//
//    }
//    @GetMapping(value = "/get")
//    public Student getStudent(){
//        return studentSetvice.getById();
//    }
//
//    @GetMapping(value = "/count/{courseName}")
//    public Long countTotal(@PathVariable String courseName){
//        return studentSetvice.countTotal(courseName);
//    }

    @GetMapping(value = "/price/{studentName}")
    public List<Course> getPrice(@PathVariable String studentName){
        return studentSetvice.getPrice(studentName);
    }
}
