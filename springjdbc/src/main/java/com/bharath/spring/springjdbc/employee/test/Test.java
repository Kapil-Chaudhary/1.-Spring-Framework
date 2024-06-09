package com.bharath.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springjdbc/employee/test/config.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");

//		Employee emp = new Employee();
//		emp.setId(2);
//		emp.setFirstName("Bob");
//		emp.setLastName("mittle");
		
		
//		int result =  dao.create(emp);
//		int result = dao.update(emp);
//		int result = dao.delete(2);
//		Employee employee = dao.read(1);
		
		List<Employee> result = dao.read();
		
		System.out.println("Employee records : " + result);
	}
}
