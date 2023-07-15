package com.example.ms_gestionClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ms_gestionClient.entities.Client;

@Repository
public interface ClientRepsitory extends JpaRepository<Client, Integer>{

}
