package com.robgro.employeemanager.controller;

import com.robgro.employeemanager.service.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping({"/","index", "index.html"})
    public String viewHomePage(Model model) {
        model.addAttribute("listOfEmployees", employeeService.getAllEmployees());
        return "index";
    }

}
