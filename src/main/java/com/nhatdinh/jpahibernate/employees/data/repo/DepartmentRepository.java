package com.nhatdinh.jpahibernate.employees.data.repo;


import com.nhatdinh.jpahibernate.employees.data.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, String> {
}
