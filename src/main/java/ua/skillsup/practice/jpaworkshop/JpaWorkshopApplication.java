package ua.skillsup.practice.jpaworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:/spring/db-context.xml")
@SpringBootApplication
public class JpaWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaWorkshopApplication.class, args);
	}
}
