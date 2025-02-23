package com.bridgelabz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGreetingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGreetingAppApplication.class, args);
	}

}


//first create multiple ids..
//POST http://localhost:8080/greeting?firstName=Raj&lastName=Chandanan
//	POST http://localhost:8080/greeting?firstName=Manish&lastName=Patel
//		
//		 to View Data in H2 Console
//
//	    open the url in web---  http://localhost:8080/h2-console
//	    Enter JDBC URL: jdbc:h2:mem:greetingdb
//	    Run the SQL query:
//
//	SELECT * FROM greetings;
//
//	