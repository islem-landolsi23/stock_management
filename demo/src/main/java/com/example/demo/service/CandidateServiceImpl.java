package com.example.demo.service;

import com.example.demo.entity.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ICandidatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidateServiceImpl implements ICandidateService{
    @Autowired
    ICandidatRepository candRepo;

    @Override
    public Candidat addCandidat(Candidat c) {
        return candRepo.save(c);
    }

    @Override
    public List<Candidat> getCandidat() {
        return (List<Candidat>) candRepo.findAll();
    }

    @Override
    public Candidat getById(Long Id) {
        Candidat c = candRepo.findById(Id).orElse(null);
        return candRepo.findById(Id).orElse(null);
    }
}
