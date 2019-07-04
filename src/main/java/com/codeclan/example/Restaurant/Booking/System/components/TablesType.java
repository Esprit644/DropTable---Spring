package com.codeclan.example.Restaurant.Booking.System.components;

public enum TablesType {

    TABLE1(2),
    TABLE2(2),
    TABLE3(2),
    TABLE4(2),
    TABLE5(4),
    TABLE6(4),
    TABLE7(4),
    TABLE8(4),
    TABLE9(6),
    TABLE10(6),
    TABLE11(6),
    TABLE12(8);

    private final int capacity;

    TablesType(int capacity){
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }
}
