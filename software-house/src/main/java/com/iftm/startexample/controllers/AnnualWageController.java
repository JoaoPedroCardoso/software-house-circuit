package com.iftm.startexample.controllers;

import com.iftm.startexample.models.dtos.AnnualWageDTO;
import com.iftm.startexample.models.dtos.EmployeeDTO;
import com.iftm.startexample.services.AnnualWageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.Instant;

@RestController
@RequestMapping("api/v1/annual-wage")
public class AnnualWageController {

    @Autowired
    private AnnualWageService annualWageService;

    @PostMapping
    public ResponseEntity<AnnualWageDTO> calculateAnnualWage(@RequestBody EmployeeDTO employeeDTO) {
        var response = new AnnualWageDTO(employeeDTO.getId(), Date.from(Instant.now()),
                annualWageService.calculateAnnualWage(employeeDTO));
        return ResponseEntity.ok(response);
    }

}
