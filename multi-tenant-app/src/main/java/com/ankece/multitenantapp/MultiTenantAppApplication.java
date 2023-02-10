package com.ankece.multitenantapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiTenantAppApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(MultiTenantAppApplication.class, args);
		} catch(Exception ex){
			System.out.println(ex);
		}

	}

}
