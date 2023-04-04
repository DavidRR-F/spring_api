package drf.springBoot.api.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "class_name")
    private String name;
    @Column(name = "class_number")
    private Integer gpa;
    // Many-to-One relationship
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;
}
