package com.codeclan.example.Restaurant.Booking.System;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import com.codeclan.example.Restaurant.Booking.System.models.TableClass;
import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.TableClassRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DropTableApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	TableClassRepository tableClassRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindAllCustomersByName(){
		List<Customer> found = customerRepository.findCustomersByName("Bill Oddie");
		assertEquals(1, found.size());
		assertEquals("Bill Oddie", found.get(0).getName());
	}

	@Test
	public void canFindAllCustomersByNameContaining(){
		List<Customer> found = customerRepository.findByNameContaining("Bil");
		assertEquals(1, found.size());
		assertEquals("Bill Oddie", found.get(0).getName());
	}

	@Test
	public void canfindBookingByBooking_CustomerName(){
		List<Booking> found = bookingRepository.findBookingByCustomerId(1L);
		assertEquals(1, found.size());
	}



}

