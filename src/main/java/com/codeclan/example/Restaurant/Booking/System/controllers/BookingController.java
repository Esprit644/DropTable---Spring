package com.codeclan.example.Restaurant.Booking.System.controllers;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/id/{id}")
    public List<Booking> findBookingByCustomerId(@PathVariable Long id) {
        return bookingRepository.findBookingByCustomerId(id);
    }

    @GetMapping(value = "/date/{date}")
    public List<Booking> getBookingsByDate(@PathVariable String date) {
        return bookingRepository.getBookingsByDate(date);
    }

    @GetMapping(value = "/name/{name}")
    public List<Booking> getByCustomerName(@PathVariable String name){
        return bookingRepository.findBookingByCustomer_Name(name);

    }

    @GetMapping(value = "/customerName/{custName}")
    public List<Booking> getDateByCustomerName(@PathVariable String custName){
        return bookingRepository.findBookingDateByCustomer_Name(custName);
    }

    @GetMapping(value = "tableanddate/{id}/{date}")
    public List<Booking> findBookingsByDiningTableIdAndDate(@PathVariable Long id, @PathVariable String date){
        return bookingRepository.findBookingsByDiningTableIdAndDate(id, date);
    }
}




//
//	@GetMapping(value = "/course/{course_id}/customerTown/{customer_town}")
//	public List<Customer> getByCourseIdAndCustomerTown(@PathVariable long course_id, @PathVariable String customer_town){
//		return customerRepository.findByBookings_CourseIdAndCustomerTown(course_id, customer_town);
//