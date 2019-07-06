package com.codeclan.example.Restaurant.Booking.System.repositories;

import com.codeclan.example.Restaurant.Booking.System.models.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface TableClassRepository extends JpaRepository<DiningTable,Long> {
}
