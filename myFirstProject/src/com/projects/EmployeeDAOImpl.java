package com.projects;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public boolean insertEmployee(Employee emp) {
        boolean status = false;
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES (?, ?, ?)")) {

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setDouble(3, emp.getSalary());

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        boolean status = false;
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("UPDATE employee SET name=?, salary=? WHERE id=?")) {

            ps.setString(1, emp.getName());
            ps.setDouble(2, emp.getSalary());
            ps.setInt(3, emp.getId());

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean deleteEmployee(int id) {
        boolean status = false;
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE id=?")) {

            ps.setInt(1, id);
            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee emp = null;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE id=?")) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
