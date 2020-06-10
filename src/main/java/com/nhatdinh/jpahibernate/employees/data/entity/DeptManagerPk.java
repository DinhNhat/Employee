package com.nhatdinh.jpahibernate.employees.data.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DeptManagerPk implements Serializable {
    @Column(name = "emp_no")
    private Integer empNo;
    @Column(name = "dept_no")
    private String deptNo;

    protected DeptManagerPk() {};

    public DeptManagerPk(Integer empNo, String deptNo) {
        this.empNo = empNo;
        this.deptNo = deptNo;
    }

//    @Override
//    public String toString() {
//        return "DeptManagerPk{" +
//                "empNo=" + empNo +
//                ", deptNo='" + deptNo + '\'' +
//                '}';
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }
}
