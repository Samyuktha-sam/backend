package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminReprository  extends JpaRepository<Admin,Long> {
}
