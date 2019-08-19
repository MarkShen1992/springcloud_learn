package com.github.markshen.springcloudlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.markshen.springcloudlearn.dao")
public class SpringcloudLearnApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudLearnApplication.class, args);
	}
}
