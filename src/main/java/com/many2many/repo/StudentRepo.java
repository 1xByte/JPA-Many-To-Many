package com.many2many.repo;

import com.many2many.model.Course;
import com.many2many.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {


//    @Query("SELECT DISTINCT entity FROM Student entity JOIN entity.courses manyToMany WHERE manyToMany.courseName = ?1")
//    Student findcourse(String courseName);

    //String findCoursePriceByCourses_CourseName(String courseName);

    List<Course> findAllCoursesByStudentName(String studentName);

//    @Query("SELECT s FROM Student s JOIN s.courses c WHERE c.courseName = :courseName")
//    List<Student> findallCourse(String courseName);



    //  List<Student> findAllByStudentName(String studentName);

   // List<Student> findAllByCourses_CourseName_AndCourses_CoursePrice(String courseName, String coursePrice);

   // Long countByCourses_CourseName(String courseName);



    //Long countByStudentName(String studentName);

//    @Query("select c from Student c.courses.courseName")
//    List<Student> getAllId();

   // List<Student> findAllByCourses_CourseName(String courseName);


    // @Query("select s from Student s")
  //  Student getStudent();
}
