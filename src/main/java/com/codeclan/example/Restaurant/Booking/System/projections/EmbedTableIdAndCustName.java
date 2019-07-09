package com.codeclan.example.Restaurant.Booking.System.projections;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import com.codeclan.example.Restaurant.Booking.System.models.DiningTable;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedTableIdAndCustName", types = Booking.class)
public interface EmbedTableIdAndCustName {
    String getDate();
    String getTime();
    int getPartySize();
    DiningTable getDiningTable();
    Customer getCustomer();
}
