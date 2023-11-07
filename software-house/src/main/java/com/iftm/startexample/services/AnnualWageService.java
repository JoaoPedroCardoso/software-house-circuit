package com.iftm.startexample.services;

import com.iftm.startexample.integration.AnnualWageResponse;
import com.iftm.startexample.integration.CompannyCalculationClient;
import com.iftm.startexample.models.dtos.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnualWageService {

    @Autowired
    CompannyCalculationClient compannyCalculationClient;

    public AnnualWageResponse calculateAnnualWage(EmployeeDTO employeeDTO) {
        return compannyCalculationClient.calculateAnnualWage(employeeDTO).getBody();
    }

}
