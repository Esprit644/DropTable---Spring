package com.codeclan.example.Restaurant.Booking.System.components;

import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Customer cust1 = new Customer("Bill Oddie", "01315234082", 0 );
        customerRepository.save(cust1);

        Customer cust2 = new Customer("Tim Brooke-Taylor", "01315551234", 0 );
        customerRepository.save(cust2);


    }

}
