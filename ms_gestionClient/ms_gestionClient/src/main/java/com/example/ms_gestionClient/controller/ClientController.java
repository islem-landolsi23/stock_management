package com.example.ms_gestionClient.controller;

import java.util.List;

import com.example.ms_gestionClient.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_gestionClient.service.IClientService;

@RestController
@RequestMapping(value = "/Client")
public class ClientController {
	@Autowired
	IClientService canService;
	@PostMapping("/AddClient")
	public Client addClient(@RequestBody Client c)
	{
		return canService.addClient(c);
	}
	
	@GetMapping("/getOne/{id}")
	public Client getOne(@PathVariable("id") int id)
	{
		return canService.getById(id);
	}
	
	@GetMapping("/getAll")
	public List<Client> getAll(){
		return canService.getClients();
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
