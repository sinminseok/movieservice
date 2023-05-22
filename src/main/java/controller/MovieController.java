package controller;

import domain.Movie;
import repository.MovieRepository;

import java.util.NoSuchElementException;

public class MovieController {

    private static final String NOT_EXIST_MOVIE = "존재하지 않는 영화압니다.";
    private static final String NOT_EXIST_SCHEDULE = "존재하지 않는 시간표입니다.";
    private static final String NOT_RESERVATION_CAPACITY = "잔여 좌석보다 많이 선택했습니다.";


    static MovieRepository movieRepository = new MovieRepository();

    public static Movie findById(int id) {
        return movieRepository.findById(checkExistMovie(id));
    }

    public static int checkExistMovie(int id) {
        if (!movieRepository.contain(id)) {
            System.out.println(NOT_EXIST_MOVIE);
            throw new IllegalArgumentException();
        }
        return id;
    }

    public static int checkExistSchedule(Movie movie, int playSchedule) {
        if (!movieRepository.existPlaySchdule(movie, playSchedule)) {
            System.out.println(NOT_EXIST_SCHEDULE);
            throw new IllegalArgumentException();
        }
        return playSchedule;
    }

    public static int checkMovieCapacity(Movie movie, int selectMovieTime, int capacity) {
        if (!movie.getPlaySchedules().get(selectMovieTime).checkCapacity(capacity)) {
            System.out.println(NOT_RESERVATION_CAPACITY);
            throw new IllegalArgumentException();
        }
        return capacity;

    }


}
