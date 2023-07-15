package com.example.demo;

import com.example.demo.entity.Candidat;
import com.example.demo.entity.Commande;
import com.example.demo.repository.ICommandeRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import com.example.demo.repository.ICandidateRepository;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    ApplicationRunner start(ICommandeRepository repo){
        return args -> {
            Stream.of(new Commande(1L,"Food","aaaa",new Date(),true),
                    new Commande(1L,"TV","bbbb",new Date(),false))
                        .forEach(
                            commande -> {
                            repo.save(commande);});
                    repo.findAll().forEach(System.out::println);
    };

    }
}
