package com.malsalkini.springboot.thymeleafdemo.dao;

import com.malsalkini.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Intellij IDEA
 * User:  malsalkini
 * Date:  09.07.2019
 * Time:  5:26 PM
 */

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
