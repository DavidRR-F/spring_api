package drf.springBoot.api.employee;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int employeeId;
    @Size(min=3, max=20, message = "Invalid characters for name")
    @Column(name = "employee_name")
    private String name;
    @Email
    @Column(name = "employee_email")
    private String email;
}
