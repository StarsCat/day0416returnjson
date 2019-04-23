package com.chunwang007.mybatis.dao;

import com.chunwang007.mybatis.bean.Employee;

import java.util.List;

public interface EmployeeMapper {

     Employee getEmpById(int id);

     List<Employee> getEmp();
}
