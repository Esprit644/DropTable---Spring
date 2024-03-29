package com.codeclan.example.Restaurant.Booking.System.repositories;

import com.codeclan.example.Restaurant.Booking.System.models.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface DiningTableRepository extends JpaRepository<DiningTable,Long> {

    List<DiningTable> findAllById(Long id);

    List<DiningTable> findDiningTableIdByBookingsId(Long id);
}
