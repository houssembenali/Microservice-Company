package tn.hoos.ms;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tn.hoos.ms.entities.Company;
import tn.hoos.ms.repositories.CompanyRepository;

@SpringBootApplication
public class MicroserviceCompanyApplication /* implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCompanyApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {}
	
	
	//@autowired with instance in other solution
	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cmp->{
				companyRepository.save(new Company(null, cmp, 100+Math.random()*900));
			});
			companyRepository.findAll().forEach(System.out::println);
		};
	}
	
}
