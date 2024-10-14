package com.example.lms.controller;

import com.example.lms.entity.Employee;
import com.example.lms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeServiceController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveemployee")
    public ResponseEntity<Employee> saveEmoloyee(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.saveemployee(employee));
    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployee());
    }

    @GetMapping("/getEMployeeById/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@RequestParam Integer empId){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeById(empId));
    }


    @DeleteMapping("/deleteEmployee/{empId}")
    public ResponseEntity deleteEmployee(@RequestParam Integer empId){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.deleteEMployee(empId));
    }

}
