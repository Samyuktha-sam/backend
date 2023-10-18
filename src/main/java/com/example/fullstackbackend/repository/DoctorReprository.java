package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorReprository extends JpaRepository<Doctor,Long> {
    public boolean existsByEmail(String email);
    public  boolean existsByEmailAndIdNot(String email,Long id);

}

