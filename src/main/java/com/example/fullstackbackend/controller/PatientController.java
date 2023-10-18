package com.example.fullstackbackend.controller;

import com.example.fullstackbackend.Service.Doctorservice;
import com.example.fullstackbackend.Service.PatientService;
import com.example.fullstackbackend.model.Doctor;
import com.example.fullstackbackend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/save")
    public ResponseEntity<Object> createPatient(@RequestBody Patient patient) {
        patientService.createPatient(patient);
        return ResponseEntity.ok("successfully saved");
    }
    @GetMapping("/getall")
    public ResponseEntity<Object> getallPatient(){
        return ResponseEntity.ok(patientService.getallPatient());
    }
    @PutMapping("/update")
    public ResponseEntity<Object> updateallPatient(@RequestBody Patient patient) {
        if (!patientService.existsByPatient(patient.getId())) {
            return ResponseEntity.ok("Patient isnt exist");
        }
        if (patientService.isUpdatePatientemailexists(patient.getEmail(), patient.getId())) {
            return ResponseEntity.ok("Patient already exist");

        }
        patientService.createPatient(patient);
        return ResponseEntity.ok("Doctor Successfully Updated");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object>deletepatientByid(@PathVariable Long id){
        patientService.deletePatient(id);
        return  ResponseEntity.ok("Delete patient");
    }
}


