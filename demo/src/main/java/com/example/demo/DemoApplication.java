package com.example.demo;

import com.example.demo.entity.Candidat;
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
    ApplicationRunner start(ICandidateRepository repo){
        return args -> {
            Stream.of(new Candidat(1L,"Rihab","idoudi",new Date(),"rihab@","qsd"),
                    new Candidat(2L,"Rihabhhhh","idoudi",new Date(),"rihab@","qsd"))
                        .forEach(
                            candidat -> {
                            repo.save(candidat);});
                    repo.findAll().forEach(System.out::println);
    };

    }
}
