package com.nhatdinh.jpahibernate.employees.data.entity;

import java.io.Serializable;
import java.util.Date;

// Create Composite PK key with annotation @IdClass
public class SalaryPk implements Serializable {
    private Integer empNo;
    private Date fromDate;

    // default constructor

    protected SalaryPk() {};

    public SalaryPk(Integer empNo, Date fromDate) {
        this.empNo = empNo;
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return "SalaryPk{" +
                "emptNo=" + empNo +
                ", fromDate=" + fromDate +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Integer getEmptNo() {
        return empNo;
    }

    public void setEmptNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
}
