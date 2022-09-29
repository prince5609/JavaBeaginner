package com.First;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String []args){
        // EXAMPLE 1    Local Date
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1); // yesterday.plusDays(2).
        System.out.println("Today is " + date);
        System.out.println("Yesterday was " + yesterday);
        System.out.println("Tomorrow will be " + tomorrow);

        System.out.println("=====================");

        // EXAMPLE 2   Is Leap Year
        if (date.isLeapYear()){
            System.out.println(date + " Is A Leap Year");
        }
        else{
            System.out.println(date + " Is Not A Leap Year");
        }

        LocalDate date2 = LocalDate.of(2016,9,23);
        if (date2.isLeapYear()){
            System.out.println(date2 + " Is A Leap Year");
        }
        else{
            System.out.println(date2 + " Is Not A Leap Year");
        }

        System.out.println("=====================");

        // EXAMPLE 3   Local Time
        LocalTime time = LocalTime.now();
        System.out.println("Current time is " + time);

        /* We can also do plus and minus like in date
           time2 = time.plusHours(4)
           time2 = time.plusMinutes(30)
        * */


        System.out.println("=====================");

        // EXAMPLE 4     Date & time together
        LocalDateTime dateTime = date.atTime(time);
        System.out.println("Date Time is " + dateTime);

        System.out.println("=====================");

        // EXAMPLE 5   Formatting date and time

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println("Local date time before formatting : " + dateTime1);

        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = dateTime1.format(formatPattern);
        System.out.println("Local date time after formatting : " + formatDateTime);
    }
}
