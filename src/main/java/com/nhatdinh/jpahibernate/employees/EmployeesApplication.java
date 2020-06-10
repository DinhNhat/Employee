package com.nhatdinh.jpahibernate.employees;

import com.nhatdinh.jpahibernate.employees.data.repo.DepartmentRepository;
import com.nhatdinh.jpahibernate.employees.data.repo.EmployeeRepository;
import com.nhatdinh.jpahibernate.employees.data.repo.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private SalaryRepository salaryRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("***********Original Employees***********");
//		this.employeeRepository.findAll().forEach(employee -> System.out.println(employee));
		System.out.println("*********The total number of Department**********");
		System.out.println(this.departmentRepository.count());
	}
}
