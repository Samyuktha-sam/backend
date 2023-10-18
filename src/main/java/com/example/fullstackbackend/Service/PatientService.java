package com.example.fullstackbackend.Service;

import com.example.fullstackbackend.model.Doctor;
import com.example.fullstackbackend.model.Patient;

import java.util.List;

public interface PatientService {
        public  void  createPatient(Patient patient);
        public List<Patient> getallPatient();
        public boolean isUpdatePatientemailexists(String email,Long id);
        public  boolean existsByPatient(Long id);


        public void deletePatient(Long id);

    }


