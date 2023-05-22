package view;

import controller.ReservationController;
import domain.Movie;
import domain.PlaySchedule;
import domain.Reservation;

import java.util.List;

//OutView에선 전달 받은 데이터를 보여주는 역할을 한다.
public class OutputView {

    public static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


    public static void printMovieSchedule(Movie movie) {
        List<PlaySchedule> playSchedules = movie.getPlaySchedules();
        playSchedules.stream().forEach(
                playSchedule -> System.out.println(playSchedule)
        );
    }

    public static void printReservation(){
        System.out.println("## 예매 정보입니다.");
        List<Reservation> reservations = ReservationController.findReservations();
        reservations.forEach(reservation -> System.out.println(reservation.getName() + reservation.getPrice() + reservation.getCapacity()));
    }
}