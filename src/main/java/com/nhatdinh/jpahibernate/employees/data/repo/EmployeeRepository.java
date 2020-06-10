package com.nhatdinh.jpahibernate.employees.data.repo;

import com.nhatdinh.jpahibernate.employees.data.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findByFirstNameLike(@Param("firstName") String firstName);
    List<Employee> findByBirthDate(@Param("birthDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate);

    @Query("select emp from Employee emp where emp.birthDate =:birthDate")
    List<Employee> searchByBirthDay(@Param("birthDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate);

    List<Employee> findByBirthDateGreaterThan(@Param("birthDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate);

    List<Employee> findByHireDateGreaterThan(@Param("hireDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date hireDate);

    List<Employee> findByBirthDateOrHireDateLessThan(@Param("birthDate")
                                                     @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate,
                                                     @Param("hireDate")
                                                     @DateTimeFormat(pattern = "yyyy-MM-dd") Date hireDate);

    /**
     * Wildcard search, beawre that the like string
     * might contain symbole '%' which should be converted into ASCII code URL
     * for example: space = %20, % = %25
     */
    List<Employee> findByLastNameLike(@Param("lastName") String lastName);

}
