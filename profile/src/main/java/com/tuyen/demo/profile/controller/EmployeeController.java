package com.tuyen.demo.profile.controller;

import com.tuyen.demo.profile.domain.EmployeeProfile;
import com.tuyen.demo.profile.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {
    final EmployeeProfileService employeeProfileService;

    public EmployeeController(EmployeeProfileService employeeProfileService) {
        this.employeeProfileService = employeeProfileService;
    }

    @PostMapping
    public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.addEmployeeProfile(employeeProfile);
    }

    @GetMapping
    public List<EmployeeProfile> getAllEmployee() {
        return employeeProfileService.getEmployeeProfiles();
    }

}