package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//start button
public class DemoApplication {
//this is where the execution ot the java class starts that means main.
	public static void main(String[] args)
	{
		//Start Spring Framework
		//Start Server
		//Load Beans
		//Load Configuration
		SpringApplication.run(DemoApplication.class, args);
	}

}
