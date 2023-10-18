package com.example.fullstackbackend.serviceImplementation;

import com.example.fullstackbackend.Service.PatientService;
import com.example.fullstackbackend.model.Patient;
import com.example.fullstackbackend.repository.PatientReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class patientServiceImplementation implements PatientService {
@Autowired
private PatientReprository patientReprository;
    @Override
    public void createPatient(Patient patient) {
        patientReprository.save(patient);
    }
    @Override
    public List<Patient> getallPatient() {
        List<Patient>patients= patientReprository.findAll();
        return patients;
    }
    @Override
    public boolean isUpdatePatientemailexists(String email, Long id) {
        return patientReprository.existsByEmailAndIdNot(email, id);
    }
    @Override
    public boolean existsByPatient(Long id) {
        return patientReprository.existsById(id);
    }
    @Override
    public void deletePatient(Long id) {
         patientReprository.deleteById(id);
    }
}
