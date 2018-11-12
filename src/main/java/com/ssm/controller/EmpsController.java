package com.ssm.controller;

import com.ssm.entity.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("emp")
public class EmpsController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("insert")
    public String inserEmps(){
        Employee employee = new Employee();
        employee.setId(UUID.randomUUID().toString());
        employee.setName("小凳子");
        employee.setSalary(8900.0);
        employee.setAge(23);
        employee.setImgsrc("12.gif");
        employeeService.insertEmp(employee);
        return "insert";
    }

    @RequestMapping("all")
    public String queryAll(HttpServletRequest request){
        List<Employee> emps = employeeService.queryAll();
        request.setAttribute("emps",emps);
        return "index";
    }
}
