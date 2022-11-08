package com.empelk.controller;

import com.empelk.model.Employee;
import com.empelk.service.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    private static final Logger LOG = LogManager.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        LOG.info("Adding Student");
        return service.addEmployee(employee);
    }

    @GetMapping("/view")
    public List<Employee> viewEmployee(){
        LOG.info("Viewing data");
        return service.viewEmployee();

    }
    @PutMapping("/update/{rollno}")
    public Employee updateEmployee (@PathVariable("rollno") long rollno, Employee employee){
        LOG.info("Updating the Student with Roll No: " + rollno);
        return service.updateEmployee(rollno, employee);

    }
    @DeleteMapping("/delete/{rollno}")
    public void deleteEmployee(@PathVariable("rollno") long rollno){
        LOG.info("Deleting the Student with Roll No: " + rollno);
        service.deleteData(rollno);


    }





}
