package com.iftm.companycalculations.controller;

import com.iftm.companycalculations.domain.AnnualWageDTO;
import com.iftm.companycalculations.domain.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/company-calculation")
public class CompanyCalculationsController {

    @PostMapping("/annual-wage")
    public ResponseEntity<AnnualWageDTO> calculateAnnualWage(@RequestBody EmployeeDTO employee) {
        double annualWage = employee.getWage() * 12;
        return ResponseEntity.ok(new AnnualWageDTO(employee.getFirstName(), annualWage));
    }

}
