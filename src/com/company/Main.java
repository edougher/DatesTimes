package com.company;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDateTime today = LocalDateTime.now(); // gets current date and time

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy hh:mm:ss");// formats current date/time

        String todayText = today.format(formatter);// initializes todayText to todays date/time
        System.out.println("Today's date is: " + todayText);// outputs todayText
        System.out.println(" ");

        LocalDateTime nextFullMoon = LocalDateTime.of(2017, 11, 4,6,22, 55);// initializes to septembers full moon
        LocalDateTime lastFullMoon = LocalDateTime.of(2017, 9, 6, 9, 02, 49 );// intitalizes to novembers full moon

        long daysToFullMoon = today.until(nextFullMoon, ChronoUnit.DAYS);
        long hoursToFullMoon = today.until(nextFullMoon, ChronoUnit.HOURS);    // this block of code calculates time (in Days,Hours,Minutes,Seconds) until
        long minutesToFullMoon = today.until(nextFullMoon, ChronoUnit.MINUTES);// novembers full moon
        long secondsToFullMoon = today.until(nextFullMoon, ChronoUnit.SECONDS);

        long daysSinceFullMoon = today.until(lastFullMoon, ChronoUnit.DAYS);
        long hoursSinceFullMoon = today.until(lastFullMoon, ChronoUnit.HOURS);    // this block calulates time (in Days,Hours,Minutes,Seconds) since
        long minutesSinceFullMoon = today.until(lastFullMoon, ChronoUnit.MINUTES);// septembers full moon
        long secondsSinceFullMoon = today.until(lastFullMoon, ChronoUnit.SECONDS);

        System.out.println("Time since last full moon in ");
        System.out.println("Days" + daysSinceFullMoon);
        System.out.println("Hours" + hoursSinceFullMoon);    // this block outputs time since last (september) full moon
        System.out.println("Minutes" + minutesSinceFullMoon);
        System.out.println("Seconds" + secondsSinceFullMoon);

        System.out.println("");

        System.out.println("Time until next full moon in ");
        System.out.println("Days" + daysToFullMoon);
        System.out.println("Hours" + hoursToFullMoon);    // this block outputs time until next (novembers) full moon
        System.out.println("Minutes" + minutesToFullMoon);
        System.out.println("Seconds" + secondsToFullMoon);


    }
}
