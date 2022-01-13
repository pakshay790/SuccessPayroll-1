package com.successpayroll;

import com.successpayroll.DAO.EmployeeDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
class SuccessPayrollApplication extends SpringBootServletInitializer {

	private Logger logger = LogManager.getLogger(this.getClass());

	@Autowired
	EmployeeDAO employeeDAO;

	public static void main(String[] args) {
		SpringApplication.run(SuccessPayrollApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SuccessPayrollApplication.class);
	}
}
