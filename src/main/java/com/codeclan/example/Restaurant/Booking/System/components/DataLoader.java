package com.codeclan.example.Restaurant.Booking.System.components;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import com.codeclan.example.Restaurant.Booking.System.models.TableClass;
import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.TableClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    TableClassRepository tableClassRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Customer cust1 = new Customer("Bill Oddie", "01315234082");
        customerRepository.save(cust1);

        Customer cust2 = new Customer("Tim Brooke-Taylor", "01315551234");
        customerRepository.save(cust2);

        TableClass table1 = new TableClass("Table1", 2);
        tableClassRepository.save(table1);

        TableClass table2 = new TableClass("Table2", 4);
        tableClassRepository.save(table2);

        Booking booking1 = new Booking("12/7/19", "17:00", 2, cust1, table1);
        bookingRepository.save(booking1);



    }

}
