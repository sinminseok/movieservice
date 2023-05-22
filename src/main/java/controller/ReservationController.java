package controller;

import domain.Movie;
import domain.PlaySchedule;
import domain.Reservation;
import repository.ReservationRepository;

import java.util.List;

public class ReservationController {

    static ReservationRepository reservationRepository = new ReservationRepository();

    public static void createReservation(Movie movie,int count,int time){
         movie.getPlaySchedules().get(time).reservationCapapcity(count);
         reservationRepository.createReservation(movie.getName(),movie.getPrice(),count,movie.getPlaySchedules().get(time).getStartDateTime());
    }

    public static List<Reservation> findReservations(){
        return reservationRepository.findReservations();
    }
}
