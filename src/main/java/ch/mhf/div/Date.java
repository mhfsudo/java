package ch.mhf.div;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);            //output 2020-12-22

        LocalTime time = LocalTime.now();
        System.out.println(time);            //output 06:36:43.331289385

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatted = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(dateTimeFormatted);
        System.out.println(formattedDate);  //output Tue, 22-12-2020 06:42:05
    }
}