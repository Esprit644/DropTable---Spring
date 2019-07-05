package com.codeclan.example.Restaurant.Booking.System.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dining_tables")
public class DiningTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "tableClass", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    private String tableName;
    private int capacity;

    public DiningTable(String tableName, int capacity) {
        this.tableName = tableName;
        this.capacity = capacity;
        this.bookings = new ArrayList<Booking>();
    }

    public DiningTable() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    public int getcapacity() {
        return capacity;
    }

    public void setcapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Booking> getBooking() {
        return bookings;
    }

    public void setBooking(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
