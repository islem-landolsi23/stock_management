package com.example.demo.controller;

import com.example.demo.entity.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ICandidateService;


import java.util.List;

@RestController
@RequestMapping(value = "/API/GestionCandidat")
public class CandidatController {
    @Autowired
    ICandidateService candidateService;

    @PostMapping("/addCandidat")
    public Candidat addCandidat(@RequestBody Candidat c) {
        return candidateService.addCandidat(c);
    }

    @GetMapping("/getAll")
    public List<Candidat> getAll() {
        return candidateService.getCandidat();
    }

}