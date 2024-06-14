package dao;
import jakarta.persistence.EntityManager;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeDAO {



    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);


}
