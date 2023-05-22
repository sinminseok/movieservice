package controller;

import domain.Movie;
import domain.PlaySchedule;
import domain.Reservation;
import repository.MovieRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class ProgramController {


    private static Movie selectMovie;
    private static int selectMovieTime;
    private static int selectCapacity;

    public static void runProgram() {
        showMovies();
        showMovieInformation();
        reservationMovie();
        showReservation();
        restart();

    }

    private static void showMovies() {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);
    }

    private static void showMovieInformation() {
        try {
            selectMovie = MovieController.findById(InputView.inputMovieId());
            OutputView.printMovieSchedule(selectMovie);
        } catch (IllegalArgumentException e) {
            showMovieInformation();
        }
    }

    private static void reservationMovie() {
        try {
            selectMovieTime = MovieController.checkExistSchedule(selectMovie, InputView.inputMovieTimeId());
            selectCapacity = MovieController.checkMovieCapacity(selectMovie, selectMovieTime, InputView.inputCapacity());
            ReservationController.createReservation(selectMovie, selectCapacity, selectMovieTime);
        } catch (IllegalArgumentException e) {
            reservationMovie();
        }
    }

    public static void showReservation(){
        OutputView.printReservation();
    }

    public static void restart(){
        if(InputView.inputRestart() == 1){
            runProgram();
        }
        return;
    }

}
