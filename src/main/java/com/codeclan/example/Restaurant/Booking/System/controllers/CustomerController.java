package com.codeclan.example.Restaurant.Booking.System.controllers;

import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/name/{name}")
    public List<Customer> findCustomersByName(@PathVariable String name){
        return customerRepository.findCustomersByName(name);
    }

    @GetMapping(value = "/partialname/{partialname}")
    public List<Customer> findByNameContaining(@PathVariable String partialname){
        return customerRepository.findByNameIgnoreCaseContaining(partialname);
    }

}
