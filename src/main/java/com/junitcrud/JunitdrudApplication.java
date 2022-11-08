package com.junitcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class JunitdrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitdrudApplication.class, args);
	}

}
