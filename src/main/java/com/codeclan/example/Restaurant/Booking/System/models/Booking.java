package com.codeclan.example.Restaurant.Booking.System.models;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore  //Properties("booking")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @JsonIgnore//Properties("booking")
    @ManyToOne
    @JoinColumn(name = "diningTable_id", nullable = false)
    private DiningTable diningTable;

    private String date;
    private String time;
    private int partySize;

    @JsonIgnore
    public Booking(String date, String time, int partySize, Customer customer, DiningTable diningTable) {
        this.date = date;
        this.time = time;
        this.partySize = partySize;
        this.customer = customer;
        this.diningTable = diningTable;

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

    public DiningTable getTableClass() {
        return diningTable;
    }

    public void setTableClass(DiningTable diningTable) {
        this.diningTable = diningTable;
    }
}


