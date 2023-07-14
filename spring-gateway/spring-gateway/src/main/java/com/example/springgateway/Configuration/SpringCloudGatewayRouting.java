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
        // .route("invitation-manager",r->r.path("/invites/**").uri("lb://invitation-management"))
        return builder.routes().route("Counties",r->r.path("/Counties/**")
                .uri("lb://Country-Client"))
                .route("Client",r->r.path("/Client/**").uri("lb://Client-Service"))

                .route("/Produit",r->r.path("/Produit/**").uri("lb://Produit-Service"))

                .route("/API/GestionCommande",r->r.path("/API/GestionCommande/**").uri("lb://demo"))

                .build();
    }
}
