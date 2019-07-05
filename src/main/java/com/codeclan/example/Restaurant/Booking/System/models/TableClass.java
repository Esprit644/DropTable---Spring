package com.codeclan.example.Restaurant.Booking.System.models;

import javax.persistence.*;

@Entity
@Table(name = "tables")
public class TableClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tableName;
    private int capacity;

    public TableClass(String tableName, int capacity) {
        this.tableName = tableName;
       this.capacity = capacity;
    }

    public TableClass() {
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
}
