package com.togo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.togo.wx.*.dao")
public class RoboootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboootApplication.class, args);
	}

}
