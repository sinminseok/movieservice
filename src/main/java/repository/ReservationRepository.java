package repository;

import domain.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {

    private static List<Reservation> reservations = new ArrayList<>();

    // create
    public static void createReservation(String name, int price, int capacity, LocalDateTime localDateTime) {
        reservations.add(new Reservation(name, price, capacity, localDateTime));
    }

    //read
    public static List<Reservation> findReservations() {
        return reservations;
    }
}
