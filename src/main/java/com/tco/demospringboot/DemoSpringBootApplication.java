package com.tco.demospringboot;

import com.tco.demospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {
	public static void main(String[] args) {

		SpringApplication.run(DemoSpringBootApplication.class, args);
		System.out.println("tco hom nay di lam");
	}

}
