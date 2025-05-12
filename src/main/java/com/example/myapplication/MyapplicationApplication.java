package com.example.myapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import com.example.myapplication.product.productservice;

@EnableAsync
@SpringBootApplication
public class MyapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyapplicationApplication.class, args)
		.getBean(productservice.class)
		.createProduct("test","test1",10);
	}
}

