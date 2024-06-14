package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);

}
