package com.example.fullstackbackend.controller;

import com.example.fullstackbackend.Service.Doctorservice;
import com.example.fullstackbackend.model.Doctor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    private Doctorservice doctorservice;
    @PostMapping("/save")
    public ResponseEntity<Object> createDoctor(@RequestBody Doctor doctor) {
       doctorservice.createDoctor(doctor);
       return ResponseEntity.ok("successfully saved");
    }
    @GetMapping("/getall")
    public ResponseEntity<Object> getallDoctors(){
        return ResponseEntity.ok(doctorservice.getallDoctors());
    }
    @PutMapping("/update")
    public ResponseEntity<Object> updateallDoctor(@RequestBody Doctor doctor) {
        if (!doctorservice.existsByDoctor(doctor.getId())) {
            return ResponseEntity.ok("Doctor isnt exist");
        }
        if (doctorservice.isUpdateDoctoremailexists(doctor.getEmail(), doctor.getId())) {
            return ResponseEntity.ok("Doctor already exist");

        }
        doctorservice.createDoctor(doctor);
        return ResponseEntity.ok("Doctor Successfully Updated");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object>deletedoctorByid(@PathVariable Long id){
        doctorservice.deletedoctor(id);
        return  ResponseEntity.ok("Delete doctor");
    }
}
