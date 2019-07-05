package com.codeclan.example.Restaurant.Booking.System.repositoryTest;

import com.codeclan.example.Restaurant.Booking.System.models.TableClass;
import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class repositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    TableClass tableClass;

    @Test
    public void contextLoads() {
    }



}
