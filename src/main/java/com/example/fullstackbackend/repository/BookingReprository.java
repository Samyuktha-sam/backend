package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingReprository extends JpaRepository<Booking,Long> {
}
