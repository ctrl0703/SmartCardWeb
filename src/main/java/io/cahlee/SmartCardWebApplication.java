package io.cahlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SmartCardWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartCardWebApplication.class, args);
	}

}
