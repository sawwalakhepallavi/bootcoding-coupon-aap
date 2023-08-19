package com.example.controller;

import com.example.model.Patient;
import com.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/ForOnePatient")
    public String insertPatient(@RequestBody Patient patient){
        return patientService.insertPatient();
    }

    public String insertMultiplePatient(@RequestBody Patient patient){
        return patientService.insertMultiplePatient();
    }
}
