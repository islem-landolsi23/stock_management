package com.example.springgateway.Configuration;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {
    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder)
    {

        return builder.routes().route("Counties",r->r.path("/Counties/**")
                .uri("lb://Country-Client"))
                .route("Client",r->r.path("/Client/**").uri("lb://Client-Service"))
                .route("/Fournisseur",r->r.path("/Fournisseur/**").uri("lb://Fournisseur-Service"))
                .build();
    }
}
