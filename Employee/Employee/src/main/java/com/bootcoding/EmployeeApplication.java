package com.bootcoding;

import com.bootcoding.model.Employee;
import com.bootcoding.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmployeeApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
//	@Autowired
//	private EmployeeService employeeService;
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("Application running");
//		List<Employee> emp= employeeService.insertEmployee(10);
//		for(Employee em:emp){
//			System.out.println(em);
//
//		}
//	}
}
