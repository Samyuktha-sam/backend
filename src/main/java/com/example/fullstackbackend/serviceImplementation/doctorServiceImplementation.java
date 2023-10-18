package com.example.fullstackbackend.serviceImplementation;

import com.example.fullstackbackend.Service.Doctorservice;
import com.example.fullstackbackend.model.Doctor;
import com.example.fullstackbackend.repository.DoctorReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class doctorServiceImplementation implements Doctorservice {
    @Autowired
    private DoctorReprository doctorReprository;


    @Override
    public void createDoctor(Doctor doctor) {
        doctorReprository.save(doctor);


    }

    @Override
    public List<Doctor> getallDoctors() {
        List<Doctor>doctors=doctorReprository.findAll();
        return doctors;

    }

    @Override
    public boolean isUpdateDoctoremailexists(String email, Long id) {
        return doctorReprository.existsByEmailAndIdNot(email, id);

    }

    @Override
    public boolean existsByDoctor(Long id) {
        return doctorReprository.existsById(id);
    }

    @Override
    public void deletedoctor(Long id) {
doctorReprository.deleteById(id);


    }


}
