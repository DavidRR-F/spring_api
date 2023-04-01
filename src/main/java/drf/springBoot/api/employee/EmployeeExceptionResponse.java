package drf.springBoot.api.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

///////////////////////////////////////
/// Generic Exposition Handler Bean ///
///////////////////////////////////////

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeExceptionResponse {
    private String errorMessage, description;
    private Date dateAndTime;
}
