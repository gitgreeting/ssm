package com.ssm.dao;

import com.ssm.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    void insertEmp(Employee employee);
    List<Employee> queryAll();
}
