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

        Customer cust5 = new Customer("John Cleese", "01315251734");
        customerRepository.save(cust5);

        Customer cust6 = new Customer("Tom Cruise", "01315251345");
        customerRepository.save(cust6);

        Customer cust7 = new Customer("Jack Reacher", "01315251675");
        customerRepository.save(cust7);

        Customer cust8 = new Customer("Roger Moore", "01415251735");
        customerRepository.save(cust8);

        Customer cust9 = new Customer("Sean Connery", "01315451735");
        customerRepository.save(cust9);

        Customer cust10 = new Customer("Timothy Dalton", "01315291735");
        customerRepository.save(cust10);

        Customer cust11 = new Customer("Bob Dylan", "01315491735");
        customerRepository.save(cust11);

        Customer cust12 = new Customer("Bob Seger", "01315291935");
        customerRepository.save(cust12);

        Customer cust13 = new Customer("Elton John", "01311291735");
        customerRepository.save(cust13);

        Customer cust14 = new Customer("Freddie Mercury", "01317291735");
        customerRepository.save(cust14);

        Customer cust15 = new Customer("Brian May", "01215291735");
        customerRepository.save(cust15);

        Customer cust16 = new Customer("Rod Stewart", "01615291735");
        customerRepository.save(cust16);

        Customer cust17 = new Customer("James May", "01815291735");
        customerRepository.save(cust17);






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


        Booking booking1 = new Booking("2019-07-12", "17:00", 2, cust1, table1, "");
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("2019-07-12", "19:00", 2, cust2, table1, "");
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("2019-07-12", "19:00", 2, cust3, table3, "");
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("2019-07-21", "19:00", 2, cust3, table3, "");
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("2019-07-23", "19:00", 2, cust4, table4, "");
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("2019-07-24", "19:00", 2, cust3, table5, "");
        bookingRepository.save(booking6);

        Booking booking7 = new Booking("2019-07-24", "21:00", 2, cust4, table6, "");
        bookingRepository.save(booking7);

        Booking booking8 = new Booking("2019-07-25", "21:00", 2, cust1, table7, "");
        bookingRepository.save(booking8);

        Booking booking9 = new Booking("2019-07-25", "17:00", 2, cust2, table8, "");
        bookingRepository.save(booking9);

        Booking booking10 = new Booking("2019-07-11", "17:00", 2, cust2, table8, "");
        bookingRepository.save(booking10);

        Booking booking11 = new Booking("2019-07-11", "19:00", 2, cust3, table6, "");
        bookingRepository.save(booking11);

        Booking booking12 = new Booking("2019-07-11", "17:00", 2, cust1, table9, "");
        bookingRepository.save(booking12);

        Booking booking13 = new Booking("2019-07-11", "21:00", 2, cust4, table2, "");
        bookingRepository.save(booking13);

        Booking booking14 = new Booking("2019-07-11", "21:00", 2, cust5, table12, "");
        bookingRepository.save(booking14);

        Booking booking15 = new Booking("2019-07-11", "19:00", 2, cust6, table3, "");
        bookingRepository.save(booking15);

        Booking booking16 = new Booking("2019-07-11", "21:00", 2, cust7, table8, "");
        bookingRepository.save(booking16);

        Booking booking17 = new Booking("2019-07-11", "18:00", 2, cust8, table4, "");
        bookingRepository.save(booking17);

        Booking booking18 = new Booking("2019-07-11", "17:00", 2, cust9, table2, "");
        bookingRepository.save(booking18);

        Booking booking19 = new Booking("2019-07-11", "20:00", 2, cust10, table11, "");
        bookingRepository.save(booking19);

        Booking booking20 = new Booking("2019-07-11", "13:00", 2, cust11, table11, "");
        bookingRepository.save(booking20);

        Booking booking21 = new Booking("2019-07-11", "14:00", 2, cust12, table4, "");
        bookingRepository.save(booking21);

        Booking booking22 = new Booking("2019-07-11", "15:00", 2, cust13, table9, "");
        bookingRepository.save(booking22);

        Booking booking23 = new Booking("2019-07-11", "13:00", 2, cust14, table5, "");
        bookingRepository.save(booking23);

        Booking booking24 = new Booking("2019-07-11", "14:00", 2, cust15, table2, "");
        bookingRepository.save(booking24);

        Booking booking25 = new Booking("2019-07-11", "15:00", 2, cust16, table6, "");
        bookingRepository.save(booking25);
    }

}
