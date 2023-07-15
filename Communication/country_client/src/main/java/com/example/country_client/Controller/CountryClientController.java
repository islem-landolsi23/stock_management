package com.example.country_client.Controller;


import com.example.country_client.Entity.CategoryProduit;
import com.example.country_client.Entity.Country;

import com.example.country_client.Entity.Produit;
import lombok.AllArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/Communication")
public class CountryClientController {
    private DiscoveryClient discoveryClient ;



    @GetMapping("/Product-category")
    public List<CategoryProduit> handleRequestProduit() {
        List<ServiceInstance> instances = discoveryClient.getInstances("Produit-Service");
        if (instances != null && !instances.isEmpty()) {
            ServiceInstance serviceInstance = instances.get(0);
            String url = serviceInstance.getUri().toString();
            url = url + "/Produit/getAll";
            RestTemplate restTemplate = new RestTemplate();
            List<Produit> Listp = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Produit>>() {}).getBody();
            List<CategoryProduit>Listc =new ArrayList<>();
            Listp.forEach(p->{
                if(p.getCategory()==1)
                {
                    CategoryProduit cp= new CategoryProduit(p.getNomProduit(),"food");
                    Listc.add(cp);
                }else if(p.getCategory()==2)
                {
                    CategoryProduit cp= new CategoryProduit(p.getNomProduit(),"clothes");
                    Listc.add(cp);
                }
            });
            return Listc;
        }
        return null;
    }
    @GetMapping("/hello")
    public String hello()
    {return "hello";}
}
