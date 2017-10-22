package com.self.learning.controller;

import com.self.learning.entity.Employee;
import com.self.learning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("")
    public String index() {
        return "emp/index";
    }

    @RequestMapping("/list")
    public String findEmployees(Model model) {
        List<Employee> employees = employeeService.findEmployees();
        model.addAttribute("employees", employees);
        return "emp/list";
    }
}
