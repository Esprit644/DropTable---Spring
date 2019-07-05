package com.codeclan.example.Restaurant.Booking.System.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tableClass_id", nullable = false)
    private DiningTable tableClass;

    private String date;
    private String time;
    private int partySize;


    public Booking(String date, String time, int partySize, Customer customer, DiningTable tableClass) {
        this.date = date;
        this.time = time;
        this.partySize = partySize;
        this.customer = customer;
        this.tableClass = tableClass;

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
        return tableClass;
    }

    public void setTableClass(DiningTable tableClass) {
        this.tableClass = tableClass;
    }
}


