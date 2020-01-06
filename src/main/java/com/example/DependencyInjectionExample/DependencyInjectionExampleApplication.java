package com.example.DependencyInjectionExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionExampleApplication.class, args);
		Programmer Prog = new Programmer();
		Prog.setCompany(context.getBean(Company2.class));
		Prog.showMyCompany();
	}

}
