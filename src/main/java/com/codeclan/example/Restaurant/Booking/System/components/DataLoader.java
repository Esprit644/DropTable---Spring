package com.codeclan.example.Restaurant.Booking.System.components;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.models.Customer;
import com.codeclan.example.Restaurant.Booking.System.models.DiningTable;
import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
import com.codeclan.example.Restaurant.Booking.System.repositories.DiningTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    DiningTableRepository diningTableRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Customer cust1 = new Customer("Bill Oddie", "01315234082");
        customerRepository.save(cust1);

        Customer cust2 = new Customer("Tim Brooke-Taylor", "01315551234");
        customerRepository.save(cust2);

        Customer cust3 = new Customer("Graeme Garden", "01315251735");
        customerRepository.save(cust3);

        Customer cust4 = new Customer("Graeme Brown", "01315251735");
        customerRepository.save(cust4);


        DiningTable table1 = new DiningTable("Table1", 2);
        diningTableRepository.save(table1);

        DiningTable table2 = new DiningTable("Table2", 4);
        diningTableRepository.save(table2);

        Booking booking1 = new Booking("12/7/19", "17:00", 2, cust1, table1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("12/7/19", "17:00", 2, cust2, table2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("12/7/19", "19:00", 2, cust3, table2);
        bookingRepository.save(booking3);



    }

}
