package com.example.ms_gestionProduit;


import com.example.ms_gestionProduit.entities.Produit;
import com.example.ms_gestionProduit.repository.ProduitRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class MsGestionProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionProduitApplication.class, args);
	}

	@Bean
	ApplicationRunner start(ProduitRepository repo) {
		return
				args -> {
					Stream.of(new Produit("Harissa", 2, 500 , 1200),
									new Produit("ketchup" , 3 , 120 , 350))
							.forEach(
									candidat -> {
										repo.save(candidat);
									});
					repo.findAll().forEach(System.out::println);
				};
	}
}




