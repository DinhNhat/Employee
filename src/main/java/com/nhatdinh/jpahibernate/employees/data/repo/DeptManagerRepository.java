package com.nhatdinh.jpahibernate.employees.data.repo;

import com.nhatdinh.jpahibernate.employees.data.entity.DeptManager;
import com.nhatdinh.jpahibernate.employees.data.entity.DeptManagerPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public interface DeptManagerRepository extends JpaRepository<DeptManager, DeptManagerPk> {
    List<DeptManager> findByPk_DeptNoAndFromDateGreaterThan(@Param("deptNo") String deptNo,
                                                            @Param("fromDate")
                                                            @DateTimeFormat(pattern ="yyyy-MM-dd") Date fromDate);

    List<DeptManager> findByFromDate(@Param("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate);

    List<DeptManager> findByDepartment_Code(@Param("code") String code);

//    @Query("select de from DeptManager de where de.fromDate = :fromDate")
//    List<DeptManager> searchByFromDateGreaterThan(@Param("fromDate") @DateTimeFormat(pattern ="yyyy-MM-DD") Date fromeDate);
}
