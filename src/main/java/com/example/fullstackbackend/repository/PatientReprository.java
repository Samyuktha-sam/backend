package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientReprository extends JpaRepository<Patient,Long> {
boolean existsByEmailAndIdNot(String email, Long id);
}
