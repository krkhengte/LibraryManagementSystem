package com.example.lms.service.impl;

import com.example.lms.entity.Employee;
import com.example.lms.repo.EmployeeRepo;
import com.example.lms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
   private EmployeeRepo employeeRepo;
    @Override
    public Employee saveemployee(Employee employee) {

        Employee save = employeeRepo.save(employee);
        System.out.println("Employee Saved Successfully");
          System.out.println("Employee Saved Successfully");

        return save;
    }

    @Override
    public String deleteEMployee(Integer empId) {

        employeeRepo.deleteById(empId);

        return "Employee Deleted";
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        Optional<Employee> byId = employeeRepo.findById(empId);

        if (byId.isPresent()){
            Employee employee = byId.get();
            return employee;
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> all = employeeRepo.findAll();
        return all;
    }
}
