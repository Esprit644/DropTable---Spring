package com.codeclan.example.Restaurant.Booking.System.controllers;

import com.codeclan.example.Restaurant.Booking.System.models.DiningTable;
import com.codeclan.example.Restaurant.Booking.System.repositories.DiningTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/diningTables")
public class DiningTableController {

    @Autowired
    DiningTableRepository diningTableRepository;

    @GetMapping(value = "/id/{id}")
    public List<DiningTable> findAllById(@PathVariable Long id){
    return diningTableRepository.findAllById(id);
    }

    @GetMapping(value = "bookingid/{id}")
    public List<DiningTable> findDiningTableByBookingsId(@PathVariable Long id){
        return diningTableRepository.findDiningTableByBookingsId(id);
    }

}
