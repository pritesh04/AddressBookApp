package com.AddressBookApp;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import  org.apache.commons.logging.Log;
import lombok.extern.slf4j.Slf4j;



@SpringBootApplication
@Slf4j
@lombok.extern.java.Log
public class AddressBookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);
//		log.info("Employee Payroll App started in {} Envoronment",
//				context.getEnvironment().getProperty("environment"));
	}

}
