package com.codeclan.example.Restaurant.Booking.System.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingTest {

    Booking booking;
    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Mr Blobby", "07888 888 888");
        booking = new Booking("12/7/19", "19:00", 4, customer);
    }

    @Test
    public void hasDate() {
        assertEquals("12/7/19", booking.getDate());
    }

    @Test
    public void hasTime() {
        assertEquals("19:00", booking.getTime());
    }

    @Test
    public void hasCustomer() {
        assertTrue(booking.getCustomer() instanceof Customer);

        String customerName = booking.getCustomer().getName();
        assertEquals("Mr Blobby", customerName);
    }
}
