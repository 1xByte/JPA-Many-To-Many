package com.many2many.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    private Integer studentId;

    private String studentName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Student_Course"
    ,joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "studentId")
    ,inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseId"))
    private Set<Course> courses= new HashSet<>();

}
