package com.iftm.startexample.integration;

import com.iftm.startexample.models.dtos.EmployeeDTO;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:8765/company-calculations/api/v1/company-calculation", name = "company")
public interface CompannyCalculationClient {

    @PostMapping("/annual-wage")
    @Retry(name = "company")
    ResponseEntity<AnnualWageResponse> calculateAnnualWage(EmployeeDTO employeeDTO);

}
