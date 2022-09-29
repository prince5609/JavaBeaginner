package com.First;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTime {
    public static void main(String []args){
        // EXAMPLE 1    Local Date
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1); // yesterday.plusDays(2).
        System.out.println("Today is " + date);
        System.out.println("Yesterday was " + yesterday);
        System.out.println("Tomorrow will be " + tomorrow);

        System.out.println("==========EXAMPLE 2===========");

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

        System.out.println("==========EXAMPLE 3===========");

        // EXAMPLE 3   Local Time
        LocalTime time = LocalTime.now();
        System.out.println("Current time is " + time);

        /* We can also do plus and minus like in date
           time2 = time.plusHours(4)
           time2 = time.plusMinutes(30)
        * */


        System.out.println("==========EXAMPLE 4===========");

        // EXAMPLE 4     Date & time together
        LocalDateTime dateTime = date.atTime(time);    // Combining diff date with diff time
        System.out.println("Date Time is " + dateTime);

        System.out.println("==========EXAMPLE 5===========");

        // EXAMPLE 5   Formatting date and time

        LocalDateTime dateTime1 = LocalDateTime.now();  // Current date with curr time
        System.out.println("Local date time before formatting : " + dateTime1);

        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = dateTime1.format(formatPattern);
        System.out.println("Local date time after formatting : " + formatDateTime);

        System.out.println("==========EXAMPLE 6===========");

        // Example 6 Get particular day of year, minute of day etc

        LocalDateTime dateTime2 = LocalDateTime.of(2022,8,18,1,55);
        System.out.println("Day of week: " + dateTime2.get(ChronoField.DAY_OF_WEEK));
        System.out.println("Day of year: " + dateTime2.get(ChronoField.DAY_OF_YEAR));
        System.out.println("Day of month: " + dateTime2.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Hour of day: " + dateTime2.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Minute of hour: " + dateTime2.get(ChronoField.MINUTE_OF_HOUR));

        System.out.println("==========EXAMPLE 7===========");

        // Example 7 Month
        MonthDay month = MonthDay.now();
        System.out.println("Curr month is " + month);
        LocalDate date1 = month.atYear(2020);  // Add year
        System.out.println(date1);

        System.out.println("==========EXAMPLE 8===========");

        // Example 8 Clock
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());

        Clock c2 = Clock.systemUTC();
        System.out.println(c2.instant());
    }
}
