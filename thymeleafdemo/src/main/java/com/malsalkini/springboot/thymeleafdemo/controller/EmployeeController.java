package com.malsalkini.springboot.thymeleafdemo.controller;


import com.malsalkini.springboot.thymeleafdemo.entity.Employee;
import com.malsalkini.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.07.2019
 * Time:  11:36 AM
 */
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // add mapping for "/list"

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // get employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring entity
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }
}









