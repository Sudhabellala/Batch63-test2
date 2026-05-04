package com.projects;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAOImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View Employee By ID");
            System.out.println("5. View All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, salary);
                    System.out.println(dao.insertEmployee(emp) ? "Inserted!" : "Failed!");
                    break;

                case 2:
                    System.out.print("Enter ID to Update: ");
                    id = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    name = sc.next();
                    System.out.print("Enter New Salary: ");
                    salary = sc.nextDouble();

                    emp = new Employee(id, name, salary);
                    System.out.println(dao.updateEmployee(emp) ? "Updated!" : "Failed!");
                    break;

                case 3:
                    System.out.print("Enter ID to Delete: ");
                    id = sc.nextInt();
                    System.out.println(dao.deleteEmployee(id) ? "Deleted!" : "Failed!");
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();
                    Employee e = dao.getEmployeeById(id);
                    System.out.println(e != null ? e : "Not Found!");
                    break;

                case 5:
                    List<Employee> list = dao.getAllEmployees();
                    for (Employee employee : list) {
                        System.out.println(employee);
                    }
                    break;

                case 6:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
            
        }
    }
}

