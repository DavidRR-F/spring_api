package drf.springBoot.api.employee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/////////////////////////////////
/// Custom Exposition Handler ///
/////////////////////////////////

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends RuntimeException{
    public EmployeeNotFound (String msg) {
        super(msg);
    }
}
