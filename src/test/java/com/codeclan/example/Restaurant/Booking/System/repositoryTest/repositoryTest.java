//package com.codeclan.example.Restaurant.Booking.System.repositoryTest;
//
//import com.codeclan.example.Restaurant.Booking.System.models.Customer;
//import com.codeclan.example.Restaurant.Booking.System.models.DiningTable;
//import com.codeclan.example.Restaurant.Booking.System.repositories.BookingRepository;
//import com.codeclan.example.Restaurant.Booking.System.repositories.CustomerRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class repositoryTest {
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Autowired
//    BookingRepository bookingRepository;
//
//    @Autowired
//    DiningTable tableClass;
//
//    @Test
//    public void contextLoads() {
//    }
//
//    @Test
//    public void canFindAllCustomersByName(){
//        List<Customer> found = customerRepository.findCustomersByName("Bill Oddie");
//        assertEquals(1, found.size());
//    }
//
//
//
//}
