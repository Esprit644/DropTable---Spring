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

        DiningTable table3 = new DiningTable("Table3", 4);
        diningTableRepository.save(table3);

        DiningTable table4 = new DiningTable("Table4", 4);
        diningTableRepository.save(table4);

        DiningTable table5 = new DiningTable("Table5", 6);
        diningTableRepository.save(table5);

        DiningTable table6 = new DiningTable("Table6", 4);
        diningTableRepository.save(table6);

        DiningTable table7 = new DiningTable("Table7", 4);
        diningTableRepository.save(table7);

        DiningTable table8 = new DiningTable("Table8", 6);
        diningTableRepository.save(table8);

        DiningTable table9 = new DiningTable("Table9", 4);
        diningTableRepository.save(table9);

        DiningTable table10 = new DiningTable("Table10", 4);
        diningTableRepository.save(table10);

        DiningTable table11 = new DiningTable("Table11", 6);
        diningTableRepository.save(table11);

        DiningTable table12 = new DiningTable("Table12", 6);
        diningTableRepository.save(table12);


        Booking booking1 = new Booking("2019-07-12", "17:00", 2, cust1, table1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("2019-07-12", "19:00", 2, cust2, table1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("2019-07-12", "19:00", 2, cust3, table3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("2019-07-21", "19:00", 2, cust3, table3);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("2019-07-23", "19:00", 2, cust4, table4);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("2019-07-24", "19:00", 2, cust3, table5);
        bookingRepository.save(booking6);

        Booking booking7 = new Booking("2019-07-24", "21:00", 2, cust4, table6);
        bookingRepository.save(booking7);

        Booking booking8 = new Booking("2019-07-25", "21:00", 2, cust1, table7);
        bookingRepository.save(booking8);

        Booking booking9 = new Booking("2019-07-25", "17:00", 2, cust2, table8);
        bookingRepository.save(booking9);


    }

}
