package com.example.lms.service;

import com.example.lms.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveemployee(Employee employee);

    public String deleteEMployee(Integer empId);

    public Employee getEmployeeById(Integer empId);

    public List<Employee> getAllEmployee();


}
