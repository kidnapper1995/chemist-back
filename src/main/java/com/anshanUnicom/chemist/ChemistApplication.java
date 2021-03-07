package com.anshanUnicom.chemist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.anshanUnicom.chemist.mapper")
public class ChemistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChemistApplication.class, args);
	}

}
