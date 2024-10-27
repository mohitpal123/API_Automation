package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RandomGenerator {

    public static int randomNumber(){

        return (int)(Math.random() * 1000);
    }

    public static String tomorrowDate(){

        LocalDate today = LocalDate.now();
        return (today.plusDays(1)).format(DateTimeFormatter.ISO_DATE);
    }

    public static String todayDate(){

        LocalDate today = LocalDate.now();
        return (today.format(DateTimeFormatter.ISO_DATE));
    }

    public static String yesterdayDate(){

        LocalDate today = LocalDate.now();
        return (today.minusDays(1)).format(DateTimeFormatter.ISO_DATE);
    }
}
