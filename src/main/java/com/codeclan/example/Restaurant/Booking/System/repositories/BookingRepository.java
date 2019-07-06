package com.codeclan.example.Restaurant.Booking.System.repositories;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingByCustomerId(Long id);
//    List<Booking> getBookingsForDate(String date);
}
