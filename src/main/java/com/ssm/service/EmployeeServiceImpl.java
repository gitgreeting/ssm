package com.ssm.service;

import com.ssm.dao.EmployeeDao;
import com.ssm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void insertEmp(Employee employee) {
        employeeDao.insertEmp(employee);
    }
    @Override
    public List<Employee> queryAll() {
        return employeeDao.queryAll();
    }
}
