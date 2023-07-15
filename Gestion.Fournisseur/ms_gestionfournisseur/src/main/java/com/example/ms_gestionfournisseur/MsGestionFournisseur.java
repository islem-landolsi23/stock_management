package com.example.ms_gestionfournisseur;

import com.example.ms_gestionfournisseur.entities.Fournisseur;
import com.example.ms_gestionfournisseur.repository.FournisseurRepsitory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class MsGestionFournisseur {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionFournisseur.class, args);
	}

	@Bean
	ApplicationRunner start(FournisseurRepsitory repo) {
		return
				args -> {
					Stream.of(new Fournisseur("Khaled", "Jalleli", "Khaled.jalleli@esprit.tn"),
									new Fournisseur("test", "retest", "test.retest@gmail.com"))
							.forEach(
									fournisseur -> {
										repo.save(fournisseur);
									});
					repo.findAll().forEach(System.out::println);
				};
	}
}




