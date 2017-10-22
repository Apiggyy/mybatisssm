package com.self.learning.service;

import com.self.learning.entity.Employee;
import com.self.learning.entity.EmployeeExample;
import com.self.learning.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Transactional(readOnly = true)
    public List<Employee> findEmployees() {
        return employeeMapper.selectByExample(null);
    }

    public List<Employee> findEmployeesByCriteria() {
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andIdEqualTo(1);
        return employeeMapper.selectByExample(example);
    }
}
