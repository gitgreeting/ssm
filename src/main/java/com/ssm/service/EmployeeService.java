package com.ssm.service;

import com.ssm.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void insertEmp(Employee employee);
    List<Employee> queryAll();
}
