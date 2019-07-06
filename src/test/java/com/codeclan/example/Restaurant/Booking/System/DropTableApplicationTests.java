package com.codeclan.example.Restaurant.Booking.System;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.DiningTableRepository;
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
	DiningTableRepository diningTableRepository;


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
		List<Customer> found = customerRepository.findByNameContaining("Gra");
		assertEquals(2, found.size());
		assertEquals("Graeme Garden", found.get(0).getName());
	}

	@Test
	public void canfindBookingByBooking_CustomerName(){
		List<Booking> found = bookingRepository.findBookingByCustomerId(1L);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetAllBookingsByDate(){
		List<Booking> found = bookingRepository.getBookingsByDate("12/7/19");
		assertEquals(3, found.size());
		assertEquals(3, found.get(2).getId(), 0 );
	}

	@Test
	public void canFindBookingByCustomerId(){
		List<Booking> found = bookingRepository.findBookingByCustomerId(3L);
		assertEquals(3, found.get(0).getId(),0);
	}

	@Test
	public void canFindBookingByCustomerName(){
		List<Booking> found = bookingRepository.findBookingByCustomer_Name("Graeme Garden");
		assertEquals(3, found.get(0).getId(), 0);

	}

	@Test
	public void  canFindDateByCustomerName(){
		List<Booking> found = bookingRepository.findBookingDateByCustomer_Name("Graeme Garden");
		assertEquals("19:00", found.get(0).getTime());
	}


	}

