package drf.springBoot.api.employee;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int employeeId;
    @Size(min=3, max=20, message = "Invalid characters for name")
    private String name;
    @Email
    private String email;
}
