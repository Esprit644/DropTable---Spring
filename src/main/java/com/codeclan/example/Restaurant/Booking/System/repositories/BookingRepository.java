package com.codeclan.example.Restaurant.Booking.System.repositories;

import com.codeclan.example.Restaurant.Booking.System.models.Booking;
import com.codeclan.example.Restaurant.Booking.System.projections.EmbedTableIdAndCustName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(excerptProjection = EmbedTableIdAndCustName.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingByCustomerId(Long id);
    List<Booking> getBookingsByDate(String date);
    List<Booking> findBookingByCustomer_Name(String name);
    List<Booking> findBookingDateByCustomer_Name(String name);
    List<Booking> findBookingsByDiningTableIdAndDate(Long id, String date);
}
