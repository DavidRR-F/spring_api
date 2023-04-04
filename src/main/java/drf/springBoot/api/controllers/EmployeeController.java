package drf.springBoot.api.controllers;

import drf.springBoot.api.employee.Employee;
import drf.springBoot.api.employee.EmployeeNotFound;
import drf.springBoot.api.employee.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping()
    public List<Employee> getAllEmployees(@RequestParam(required = false) String name) {
        List<Employee> employees;
        if(name != null) {
            employees = employeeService.getEmployeesByName(name);
        }
        else {
            employees = employeeService.getAllEmployees();
        }

        if(employees.size() < 1) {
            throw new EmployeeNotFound("No Employees by that name");
        }
        return employees;
    }

    @GetMapping("/{empId}")
    public EntityModel<Employee> getEmployee(@PathVariable int empId) {
        Optional<Employee> employee = employeeService.getEmployeeById(empId);
        if(employee.isEmpty()) {
            throw new EmployeeNotFound("Invalid Employee Information");
        }
        EntityModel<Employee> model = EntityModel.of(employee.get());
        Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllEmployees(null)).withRel("all-employees");
        model.add(link);
        return model;
    }

    @PostMapping()
    public ResponseEntity<Object> addEmployee(@Valid @RequestBody Employee emp) {
        Employee newEmployee = employeeService.addEmployee(emp);
        // Creates uri to send to user upon adding employee
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{employeeId}").buildAndExpand(newEmployee.getEmployeeId()).toUri();
        return ResponseEntity.created(uri).build();
    }

//    @DeleteMapping("/{empId}")
//    public ResponseEntity<Object> deleteEmployee(@PathVariable int empId) {
//        Employee employee = employeeService.deleteEmployee(empId);
//        if (null == employee) {
//            throw new EmployeeNotFound("Invalid Employee Information");
//        }
//        return ResponseEntity.accepted().build();
//    }
}
