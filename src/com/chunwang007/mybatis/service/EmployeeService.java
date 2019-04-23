package com.chunwang007.mybatis.service;

import com.chunwang007.mybatis.bean.Employee;
import com.chunwang007.mybatis.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getEmps(){

       return employeeMapper.getEmp();
    }
}
