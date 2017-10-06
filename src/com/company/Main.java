package com.company;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy hh:mm:ss");

        String todayText = today.format(formatter);
        System.out.println("Today's date is: " + todayText);
        System.out.println(" ");

        LocalDateTime nextFullMoon = LocalDateTime.of(2017, 10, 5,8,40, 8);
        LocalDateTime lastFullMoon = LocalDateTime.of(2017, 9, 6, 9, 02, 49 );

        long daysToFullMoon = today.until(nextFullMoon, ChronoUnit.DAYS);
        long hoursToFullMoon = today.until(nextFullMoon, ChronoUnit.HOURS);
        long minutesToFullMoon = today.until(nextFullMoon, ChronoUnit.MINUTES);
        long secondsToFullMoon = today.until(nextFullMoon, ChronoUnit.SECONDS);

        long daysSinceFullMoon = today.until(lastFullMoon, ChronoUnit.DAYS);
        long hoursSinceFullMoon = today.until(lastFullMoon, ChronoUnit.HOURS);
        long minutesSinceFullMoon = today.until(lastFullMoon, ChronoUnit.MINUTES);
        long secondsSinceFullMoon = today.until(lastFullMoon, ChronoUnit.SECONDS);

        System.out.println("Time since last full moon in ");
        System.out.println("Days" + daysSinceFullMoon);
        System.out.println("Hours" + hoursSinceFullMoon);
        System.out.println("Minutes" + minutesSinceFullMoon);
        System.out.println("Seconds" + secondsSinceFullMoon);

        System.out.println("");

        System.out.println("Time until next full moon in ");
        System.out.println("Days" + daysToFullMoon);
        System.out.println("Hours" + hoursToFullMoon);
        System.out.println("Minutes" + minutesToFullMoon);
        System.out.println("Seconds" + secondsToFullMoon);


    }
}
