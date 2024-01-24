package com.luv2code.springboot.demo.mycoolapp.dao;

import com.luv2code.springboot.demo.mycoolapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByOrderByLastNameAsc();
}
