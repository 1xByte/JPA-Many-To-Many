package com.many2many.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {

    @Id
    private Integer courseId;

    private String courseName;

    private String coursePrice;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students =new HashSet<>();
}
