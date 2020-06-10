package com.nhatdinh.jpahibernate.employees.web;

import com.nhatdinh.jpahibernate.employees.data.entity.DeptManager;
import com.nhatdinh.jpahibernate.employees.data.repo.DeptManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/user-definedAPI")
public class DeptManagerWebServiceController {

    private final DeptManagerRepository deptManagerRepository;

    @Autowired
    public DeptManagerWebServiceController(DeptManagerRepository deptManagerRepository) {
        this.deptManagerRepository = deptManagerRepository;
    }

//    @RequestMapping(method = RequestMethod.GET, path = "/byFromDate")
//    public List<DeptManager> searchByFromDate(@RequestBody @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate) {
//        return this.deptManagerRepository.findByFromDate(fromDate);
//    }
}
