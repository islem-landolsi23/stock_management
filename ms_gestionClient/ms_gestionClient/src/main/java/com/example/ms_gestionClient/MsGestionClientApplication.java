package com.example.ms_gestionClient;

import com.example.ms_gestionClient.entities.Client;
import com.example.ms_gestionClient.repository.ClientRepsitory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class MsGestionClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionClientApplication.class, args);
	}

	@Bean
	ApplicationRunner start(ClientRepsitory repo) {
		return
				args -> {
					Stream.of(new Client("Jabeur", "Ones", "ons.jabeur@esprit.tn"),
									new Client("test", "retest", "test.retest@gmail.com"))
							.forEach(
									candidat -> {
										repo.save(candidat);
									});
					repo.findAll().forEach(System.out::println);
				};
	}
}




