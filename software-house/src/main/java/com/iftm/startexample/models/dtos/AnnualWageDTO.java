package com.iftm.startexample.models.dtos;

import com.iftm.startexample.integration.AnnualWageResponse;

import java.io.Serializable;
import java.util.Date;

public class AnnualWageDTO implements Serializable {
    private String id;
    private Date date;
    private AnnualWageResponse annualWage;

    public AnnualWageDTO() { }

    public AnnualWageDTO(String id, Date date, AnnualWageResponse annualWage) {
        this.id = id;
        this.date = date;
        this.annualWage = annualWage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AnnualWageResponse getAnnualWage() {
        return annualWage;
    }

    public void setAnnualWage(AnnualWageResponse annualWage) {
        this.annualWage = annualWage;
    }
}
