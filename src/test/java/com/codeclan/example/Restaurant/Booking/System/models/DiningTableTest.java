package com.codeclan.example.Restaurant.Booking.System.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiningTableTest {
    DiningTable table;

    @Before
    public void before() {
        table = new DiningTable("Table 1", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Table 1", table.getTableName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, table.getcapacity());


    }
}