package com.example.fullstackbackend.Service;

import com.example.fullstackbackend.model.Doctor;

import java.util.List;

public interface Doctorservice {
    public  void  createDoctor(Doctor doctor);
    public List<Doctor> getallDoctors();
public boolean isUpdateDoctoremailexists(String email,Long id);
public  boolean existsByDoctor(Long id);


public void deletedoctor(Long id);

}
