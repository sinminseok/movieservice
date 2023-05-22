package utils;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


public class DateTimeUtilsTest {
    @Test
    public void createDateTime() {
        LocalDateTime dateTime = DateTimeUtils.createDateTime("2019-04-16 11:23");

    }

    @Test
    public void isOneHourWithinRange() {

    }

    @Test
    public void isOneHourWithoutRange() {

    }
}