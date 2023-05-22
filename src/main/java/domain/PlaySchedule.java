package domain;

import java.time.LocalDateTime;

import static utils.DateTimeUtils.format;

public class PlaySchedule {
    private final LocalDateTime startDateTime;
    private int capacity;

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }


    public PlaySchedule(LocalDateTime startDateTime, int capacity) {
        this.startDateTime = startDateTime;
        this.capacity = capacity;
    }

    public boolean checkCapacity(int capacity){
        if(this.capacity < capacity){
            return false;
        }
        return true;
    }

    public void reservationCapapcity(int capacity){
        this.capacity -= capacity;
    }

    @Override
    public String toString() {
        return "시작시간: " + format(startDateTime) + " 예약가능인원: " + capacity + "\n";
    }
}