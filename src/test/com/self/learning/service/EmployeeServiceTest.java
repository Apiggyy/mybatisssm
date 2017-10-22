package com.self.learning.service;

import com.self.learning.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void findEmployees() throws Exception {
        List<Employee> employees = employeeService.findEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void findEmployeesByCriteria() throws Exception {
        List<Employee> employees = employeeService.findEmployeesByCriteria();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}