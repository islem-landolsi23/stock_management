package com.example.demo.service;

import com.example.demo.entity.Candidat;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICandidateService {
    public Candidat addCandidat(Candidat c);
    public List<Candidat> getCandidat();
    public Candidat getById(Long Id);
}
