package com.nhatdinh.jpahibernate.employees.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "dept_manager")
public class DeptManager {
    @EmbeddedId
    private DeptManagerPk pk;

    @ManyToOne
    @MapsId("emp_no")
    @JoinColumn(name = "emp_no")
    private Employee employee;

    @ManyToOne
    @MapsId("dept_no")
    @JoinColumn(name = "dept_no")
    private Department department;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    public DeptManager() {};

    public DeptManager(DeptManagerPk pk, Date fromDate, Date toDate) {
        this.pk = pk;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "DeptManager{" +
                "pk=" + pk +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }

    //    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    public DeptManagerPk getPk() {
        return pk;
    }

    public void setPk(DeptManagerPk pk) {
        this.pk = pk;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
