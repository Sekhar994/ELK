package com.empelk.service;

import com.empelk.model.Employee;
import com.empelk.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    //add data

 public Employee addEmployee(Employee employee){ return repo.save(employee); }

    //view
    public List<Employee> viewEmployee() { return repo.findAll(); }

    //update
 public Employee updateEmployee(long rollno, Employee employee ){ return repo.save(employee); }

    //delete
    public void deleteData(long rollno){
        repo.deleteById(rollno);
    }

}
