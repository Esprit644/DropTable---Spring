package com.codeclan.example.Restaurant.Booking.System.repositories;

import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomersByName(String name);
    List<Customer> findByNameIgnoreCaseContaining(String name);
    List<Customer> findByBookings_DiningTableIdAndBookings_Date(Long id, String date);
    List<Customer> findByBookings_DiningTableIdAndBookings_DateAndBookings_Time(Long id, String date, String time);


//    List<Customer> findAllCustomersByBookingCounter(int bookingCounter);
}
