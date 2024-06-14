package dao;

import jakarta.persistence.EntityManager;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entitymanager;


    @Override
    public List<Employee> get() {
        Session currentsession = entitymanager.unwrap(Session.class);
        Query<Employee> query = currentsession.createQuery("From Employee", Employee.class);
        List <Employee> list= query.getResultList();
        return list;
    }

    @Override
    public Employee get(int id) {
        Session currentsession = entitymanager.unwrap(Session.class);
        Employee employeeObj=currentsession.get(Employee.class, id);
        return employeeObj;
    }

    //save and update
    @Override
    public void save(Employee employee) {
        Session currentsession = entitymanager.unwrap(Session.class);
        currentsession.saveOrUpdate(employee);

    }

    @Override
    public void delete(int id) {
        Session currentsession = entitymanager.unwrap(Session.class);
        Employee employeeObj=currentsession.get(Employee.class,id);
        currentsession.delete(employeeObj);

    }


}


