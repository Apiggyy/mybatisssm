package com.self.learning.service;

import com.self.learning.entity.Employee;
import com.self.learning.mapper.EmployeeMapper;
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

    @Autowired
    private EmployeeMapper employeeMapper;

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

    @Test
    public void testGeneratorMapper() {
        Employee employee = new Employee();
        employee.setLastName("weizhiming");
        List<Employee> employees = employeeMapper.select(employee);
        System.out.println(employees);
    }

}