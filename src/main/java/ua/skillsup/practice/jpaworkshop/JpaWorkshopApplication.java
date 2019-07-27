package ua.skillsup.practice.jpaworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import ua.skillsup.practice.jpaworkshop.dao.ItemRepository;
import ua.skillsup.practice.jpaworkshop.dao.entity.Item;

@ImportResource("classpath:/spring/db-context.xml")
@SpringBootApplication
public class JpaWorkshopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(JpaWorkshopApplication.class, args);
		ItemRepository itemRepository = context.getBean(ItemRepository.class);
		System.out.println(itemRepository.findAll());
	}
}
