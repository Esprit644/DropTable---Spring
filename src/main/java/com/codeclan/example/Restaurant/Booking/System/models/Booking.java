package com.codeclan.example.Restaurant.Booking.System.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties("bookings")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @JsonIgnoreProperties("booking")
    @ManyToOne
    @JoinColumn(name = "diningTable_id", nullable = false)
    private DiningTable diningTable;

    private String date;
    private String time;
    private int partySize;
    private String customerHref;


    public Booking(String date, String time, int partySize, Customer customer, DiningTable diningTable, String customerHref) {
        this.date = date;
        this.time = time;
        this.partySize = partySize;
        this.customer = customer;
        this.diningTable = diningTable;
        this.customerHref = customerHref;

    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DiningTable getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(DiningTable diningTable) {
        this.diningTable = diningTable;
    }

    public String getCustomerHref() {
        return customerHref;
    }

    public void setCustomerHref(String customerHref) {
        this.customerHref = customerHref;
    }
}


