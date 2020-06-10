package com.nhatdinh.jpahibernate.employees.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "salaries")
@IdClass(SalaryPk.class)
public class Salary {
    @Id
    @Column(name = "emp_no")
    private Integer empNo;

    @Id
    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "salary")
    private Integer salary;
    @Column(name = "to_date")
    private Date toDate;

    public Salary() {};

    public Salary(Integer empNo, Date fromDate, Integer salary, Date toDate) {
        this.empNo = empNo;
        this.fromDate = fromDate;
        this.salary = salary;
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "empNo=" + empNo +
                ", fromDate=" + fromDate +
                ", salary=" + salary +
                ", toDate=" + toDate +
                '}';
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
