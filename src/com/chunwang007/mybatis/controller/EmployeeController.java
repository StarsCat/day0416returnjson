package com.chunwang007.mybatis.controller;

import com.chunwang007.mybatis.bean.Employee;
import com.chunwang007.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/getEmps",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List getEmps(){

        return employeeService.getEmps();
    }
}
