package domain;

import java.time.LocalDateTime;

public class Reservation {
    private final String name;
    private final int price;
    private final int capacity;
    private final LocalDateTime localDateTime;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }



    public Reservation(String name, int price, int capacity, LocalDateTime localDateTime) {

        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.localDateTime = localDateTime;
    }
}
