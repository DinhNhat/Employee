package com.nhatdinh.jpahibernate.employees.data.repo;

import com.nhatdinh.jpahibernate.employees.data.entity.Salary;
import com.nhatdinh.jpahibernate.employees.data.entity.SalaryPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public interface SalaryRepository extends PagingAndSortingRepository<Salary, SalaryPk> {
    List<Salary> findByEmployee_Id(@Param("id") Integer id);
    Page<Salary> findByPk_FromDate(@Param("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate, Pageable pageable);
}
