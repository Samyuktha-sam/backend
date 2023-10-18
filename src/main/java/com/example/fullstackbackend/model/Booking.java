package com.example.fullstackbackend.model;

import java.util.Currency;
import java.util.Date;

public class Booking {
    private  Long id;
    private Patient patient;
    private Doctor doctor;
    private String problem;
    private  String prescription;
    private Date appointemntdate;
    private String appointmentstatus;
    private Currency appointmentprice;
    private  String action;


}
