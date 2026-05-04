package com.projects;

import java.util.List;

public interface EmployeeDAO {
    boolean insertEmployee(Employee emp);
    boolean updateEmployee(Employee emp);
    boolean deleteEmployee(int id);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
}

