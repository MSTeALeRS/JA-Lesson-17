package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class);
		UniversityService service = context.getBean(UniversityService.class);


		University university = new University("Monada","medium", 5,500,"Lviv");
		University university1 = new University("Medical","high", 10,1500,"Lviv");
		University university2 = new University("Franko","high", 8,2000,"Lviv");
		University university3 = new University("Mohil","high", 15,2300,"Kyiv");
		service.save(university);
		service.save(university1);
		service.save(university2);
		service.save(university3);

		service.findAll().stream().forEach(System.out::println);

		University univer = service.findById(2L);
		System.out.println(univer);
		univer.setName("Monada");
		service.update(univer);

		System.out.println("Level - high");
		service.findByLevel("high").stream().forEach(System.out::println);
		System.out.println("Institut - 10");
		service.findByInstitut(10).stream().forEach(System.out::println);
		System.out.println("Students -2000");
		service.findByStudent(2000).stream().forEach(System.out::println);
		System.out.println("Adress - Kyiv");
		service.findByAdress("Kyiv").stream().forEach(System.out::println);
		context.close();

	}


}
