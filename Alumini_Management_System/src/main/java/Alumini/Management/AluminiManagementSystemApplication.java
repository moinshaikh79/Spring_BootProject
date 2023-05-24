package Alumini.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Alumini.Management.entity.Alumini;
import Alumini.Management.repository.AluminiRepository;

@SpringBootApplication
public class AluminiManagementSystemApplication implements CommandLineRunner {
	

	@Autowired
	private AluminiRepository aluminiRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AluminiManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		Alumini a1 = Alumini.builder().name("Pratik").phone("9284306284").email("pratik@gmail.com").grdYear("2023").build();
		Alumini a2 = Alumini.builder().name("Swastikia").phone("8997921050").email("swastika@gmail.com").grdYear("2022").build();
		Alumini a3 = Alumini.builder().name("Shravani").phone("8888888888").email("shravani@gmail.com").grdYear("2021").build();
		Alumini a4 = Alumini.builder().name("Sakshi").phone("9999999999").email("sakshi@gmail.com").grdYear("2023").build();
	
		
		aluminiRepository.save(a1);
		aluminiRepository.save(a2);
		aluminiRepository.save(a3);
		aluminiRepository.save(a4);
	
		System.out.println("--------------------------All saved-------------------------");

	}
		
	}
