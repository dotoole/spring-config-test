package uk.co.bbc.jupiter.springcloudservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SimpleWebApplication {
    public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}
}
