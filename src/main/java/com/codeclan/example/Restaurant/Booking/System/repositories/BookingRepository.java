package com.codeclan.example.Restaurant.Booking.System.repositories;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
