package com.codeclan.example.Restaurant.Booking.System.models;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String phoneNumber;
    private int bookingCounter;

    public Customer(String name, String phoneNumber, int bookingCounter) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bookingCounter = bookingCounter;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBookingCounter() {
        return bookingCounter;
    }

    public void setBookingCounter(int bookingCounter) {
        this.bookingCounter = bookingCounter;
    }
}

