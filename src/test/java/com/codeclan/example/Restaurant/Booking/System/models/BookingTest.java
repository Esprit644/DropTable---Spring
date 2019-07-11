package com.codeclan.example.Restaurant.Booking.System.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingTest {

    Booking booking1;
    Customer customer1;
    DiningTable table1;

    @Before
    public void before(){
        table1 = new DiningTable("table1", 6);
        customer1 = new Customer("Mr Blobby", "07888 888 888");
        booking1 = new Booking("12/7/19", "19:00", 4, customer1, table1, "");
    }

    @Test
    public void hasDate() {
        assertEquals("12/7/19", booking1.getDate());
    }

    @Test
    public void hasTime() {
        assertEquals("19:00", booking1.getTime());
    }

    @Test
    public void hasCustomer() {
        assertTrue(booking1.getCustomer() instanceof Customer);

        String customerName = booking1.getCustomer().getName();
        assertEquals("Mr Blobby", customerName);
    }
}
