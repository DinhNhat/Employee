package com.nhatdinh.jpahibernate.employees.data.repo;

import com.nhatdinh.jpahibernate.employees.data.entity.Salary;
import com.nhatdinh.jpahibernate.employees.data.entity.SalaryPk;
import org.springframework.data.repository.CrudRepository;

public interface SalaryRepository extends CrudRepository<Salary, SalaryPk> {
}
