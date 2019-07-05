package com.codeclan.example.Restaurant.Booking.System.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Mr Blobby", "07888 888 888");
    }

    @Test
    public void hasName() {
        assertEquals("Mr Blobby", customer.getName());
    }

    @Test
    public void hasPhoneNumber() {
        assertEquals("07888 888 888", customer.getPhoneNumber());
    }
}
