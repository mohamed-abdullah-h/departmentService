package com.main;

//import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.main.mapper.DepartmentMapper;

@SpringBootApplication
public class DepartmentServiceApplication {

	/*
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
*/
	@Bean
	DepartmentMapper mapper(){
		 return DepartmentMapper.INSTANCE;
	}
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
