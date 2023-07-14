package com.example.demo.repository;

import com.example.demo.entity.Candidat;
import com.example.demo.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommandeRepository extends JpaRepository<Commande,Long> {
}
