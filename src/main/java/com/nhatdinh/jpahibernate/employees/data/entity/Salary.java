package com.nhatdinh.jpahibernate.employees.data.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Using IdClass annotation in composite key
 */
@Entity
@Table(name = "salaries")
public class Salary {

    @EmbeddedId
    private SalaryPk pk;

    @ManyToOne
    @MapsId("emp_no")
    @JoinColumn(name = "emp_no")
    private Employee employee;

    @Column(name = "salary")
    private Integer salary;
    @Column(name = "to_date")
    private Date toDate;

    public Salary() {};

    public Salary(SalaryPk pk, Integer salary, Date toDate) {
        this.pk = pk;
        this.salary = salary;
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "pk=" + pk +
                ", salary=" + salary +
                ", toDate=" + toDate +
                '}';
    }

    public SalaryPk getPk() {
        return pk;
    }

    public void setPk(SalaryPk pk) {
        this.pk = pk;
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
