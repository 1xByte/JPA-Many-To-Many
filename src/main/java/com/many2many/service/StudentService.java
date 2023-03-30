package com.many2many.service;

import com.many2many.model.Course;
import com.many2many.model.Student;
import com.many2many.repo.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student){
      return  studentRepo.saveAndFlush(student);
    }

//    public Student getById(){
//        Student student = studentRepo.getStudent();
//        return student;
//    }


    public List<Student> getAll(){
     return   studentRepo.findAll();

    }

//    public List<Student> getAllByName(String studentName){
//        return   studentRepo.findAllByStudentName(studentName);
//
//    }

//    public List<Student> getAllByquery(Integer numm, String name){
//        return studentRepo.getAllId(numm, name);
//
//    }
//public List<Student> getAllByquery(String courseName,String coursePrice){
//
//    return studentRepo.findAllByCourses_CourseName_AndCourses_CoursePrice(courseName,coursePrice);
//
//}

//public Long countTotal(String courseName){
//       return studentRepo.countByCourses_CourseName(courseName);
//}
    public List<Course> getPrice(String studentName) {

     //   Student student = studentRepo.findcourse(courseName);
//        List<Course> collect = student.getCourses().stream()
//                .filter(e -> e.getCourseName().equals(courseName))
//                .map(e->e).collect(Collectors.toList());

    return     studentRepo.findAllCoursesByStudentName(studentName);





    }


    }

