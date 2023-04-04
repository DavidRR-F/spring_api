package drf.springBoot.api.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_gpa")
    private Long gpa;
    // One-to-Many Relationship
    @OneToMany(mappedBy = "student")
    List<Class> studentClasses;
}
