package com.example.demo.repository;

import com.example.demo.entity.Candidat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@ComponentScan
public interface ICandidateRepository extends JpaRepository<Candidat,Long> {
}
