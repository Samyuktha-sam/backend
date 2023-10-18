package com.example.fullstackbackend.Service;

import com.example.fullstackbackend.model.Booking;
import com.example.fullstackbackend.repository.BookingReprository;
import org.springframework.beans.factory.annotation.Autowired;

public interface AdminService {
    public void createbooking(Booking booking);
}

