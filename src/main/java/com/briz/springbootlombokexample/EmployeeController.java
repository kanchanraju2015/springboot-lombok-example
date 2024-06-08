package com.briz.springbootlombokexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeRepository erepo;
	// while using lombok into the project mvn clean install so that the jar is downloaded
	// first check the maven dependency for lombok.jar file then use this auto available 
@RequestMapping("/save")
public String test()
{
	Employee e=new Employee();
	e.setAge(43);
	e.setCity("ranchi");
	e.setName("chanda");
	erepo.save(e);	
	return "data saved";
}
}
