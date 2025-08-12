package vn.chinhde.phonestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class PhonestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonestoreApplication.class, args);
	}

}
