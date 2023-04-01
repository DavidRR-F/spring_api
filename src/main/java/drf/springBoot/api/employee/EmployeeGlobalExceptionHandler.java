package drf.springBoot.api.employee;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

/////////////////////////////////////
/// Error Message Rest Controller ///
/////////////////////////////////////

@RestController
@ControllerAdvice //applies this functionality to all controller
public class EmployeeGlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
        EmployeeExceptionResponse exception = new EmployeeExceptionResponse(
                ex.getMessage(),
                request.getDescription(false),
                new Date()
                );
        return new ResponseEntity<Object>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = EmployeeNotFound.class)
    public ResponseEntity<Object> handleEmployeeNotFoundException(Exception ex, WebRequest request) {
        EmployeeExceptionResponse exception = new EmployeeExceptionResponse(
                ex.getMessage(),
                request.getDescription(false),
                new Date()
        );
        return new ResponseEntity<Object>(exception, HttpStatus.NOT_FOUND);
    }

    //////////////////////////
    //// Validation Error ////
    //////////////////////////
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        EmployeeExceptionResponse exception =
                new EmployeeExceptionResponse("Invalid Input", ex.getBindingResult().getFieldError().getDefaultMessage(), new Date());
        return new ResponseEntity<Object>(exception, HttpStatus.BAD_REQUEST);
    }
}
