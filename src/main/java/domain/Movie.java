package domain;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private static final char NEW_LINE = '\n';

    private final int id;
    private final String name;
    private final int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    private List<PlaySchedule> playSchedules = new ArrayList<>();

    public Movie(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean contains(int movieId) {
        return this.id == movieId;
    }



    public boolean equalId(int id){
        if(this.id == id){
            return true;
        }
        return false;
    }

    public List<PlaySchedule> getPlaySchedules() {
        return this.playSchedules;
    }


    public void addPlaySchedule(PlaySchedule playSchedule) {
        playSchedules.add(playSchedule);
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PlaySchedule playSchedule : playSchedules) {
            sb.append(playSchedule);
        }
        return id + " - " + name + ", " + price + "원" + NEW_LINE
                + sb.toString();
    }
}
