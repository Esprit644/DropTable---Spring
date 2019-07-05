package com.codeclan.example.Restaurant.Booking.System.repositories;

import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllCustomersByName(String name);
    List<Customer> findAllCustomersByBookingCounter(int bookingCounter);
}
