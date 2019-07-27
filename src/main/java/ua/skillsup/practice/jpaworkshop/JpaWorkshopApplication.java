package ua.skillsup.practice.jpaworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import ua.skillsup.practice.jpaworkshop.dao.ItemRepository;
import ua.skillsup.practice.jpaworkshop.dao.LotRepository;
import ua.skillsup.practice.jpaworkshop.dao.UserRepository;
import ua.skillsup.practice.jpaworkshop.dao.entity.Item;
import ua.skillsup.practice.jpaworkshop.service.AuctionService;

import java.math.BigDecimal;
import java.time.LocalDate;

@ImportResource("classpath:/spring/db-context.xml")
@SpringBootApplication
public class JpaWorkshopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(JpaWorkshopApplication.class, args);

		ItemRepository itemRepository = context.getBean(ItemRepository.class);
		UserRepository userRepository = context.getBean(UserRepository.class);
		LotRepository lotRepository = context.getBean(LotRepository.class);
		System.out.println(lotRepository.findAll().size());


//		System.out.println(itemRepository.findAll());
//		System.out.println(itemRepository.findByTitle("Dinning table"));
//		System.out.println(itemRepository.findByWeightGreaterThen(0.05));
//
//		System.out.println(userRepository.findAll());

//		System.out.println(lotRepository.findAll());
//		System.out.println(lotRepository.findByUserNameAndUpdateDate(
//				"Odin",
//				LocalDate.now().minusDays(5),
//				LocalDate.now().plusDays(1)));

		AuctionService service = context.getBean(AuctionService.class);
		System.out.println(service.createLot("Loki", "Dinning table", BigDecimal.valueOf(555), 10));
		System.out.println(lotRepository.findAll().size());
	}
}
