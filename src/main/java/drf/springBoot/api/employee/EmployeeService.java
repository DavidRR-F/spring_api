package drf.springBoot.api.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1, "Doug", "doug@gmail.com"));
        list.add(new Employee(2, "Alex", "alex@gmail.com"));
        list.add(new Employee(3, "Jan", "jan@gmail.com"));
        list.add(new Employee(4, "Doug", "doug@gmail.com"));
    }

    public List<Employee> getAllEmployees() {
        return list;
    }

    public Employee getEmployeeById(int empId) {
        return list.stream().filter(emp -> emp.getEmployeeId()==empId).findAny().orElse(null);
    }

    public Employee addEmployee(Employee emp) {
        emp.setEmployeeId(list.size()+1);
        list.add(emp);
        return emp;
    }

    public List<Employee> getEmployeesByName(String empName) {
        return list.stream().filter(emp -> emp.getName().equals(empName)).collect(Collectors.toList());
    }

    public Employee deleteEmployee(int empId) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if(emp.getEmployeeId() == empId) {
                iterator.remove();
                return emp;
            }
        }
        return null;
    }
}
