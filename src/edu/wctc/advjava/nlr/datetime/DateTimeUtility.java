package edu.wctc.advjava.nlr.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *This class contains methods for datetime arithmetic and conversion
 *between String and LocalDateTime
 * <br>
 * @author Naython L. Rdiall Email: nlr17_u@hotmail.com
 * @version 1.0
 * @since 1.8
 */
public class DateTimeUtility {
    
    /**
     * This method takes a LocalDate object and converts it into a string
     * @param date This is the LocalDate object to be converted into a string
     * @return LocalDate object as a string.
     * @throws IllegalArgumentException if the LocalDate object is null
     */
    public String dateToString(LocalDate date) throws IllegalArgumentException{
        if(date == null){
            throw new IllegalArgumentException("Error with dateToString");
        }
        return String.valueOf(date);
    }
    
    /**
     * This method takes a LocalDateTime object and converts it into a string
     * @param dateTime This is the LocalDateTime object to be converted into a string
     * @return LocalDateTime object as a string.
     * @throws IllegalArgumentException if the LocalDateTime object is null
     */
    public String dateTimeToString(LocalDateTime dateTime) throws IllegalArgumentException{
        if(dateTime == null){
            throw new IllegalArgumentException("Error with dateTimeToString");
        }
        return String.valueOf(dateTime);
    } 
    
    /**
     * This method takes a LocalDateTime object and converts it into a formatted string.
     * @param time This is the LocalDateTime Object to be converted
     * @param fmt This is the format which you would like the string to be in
     * @return LocalDateTime object as a formated string
     * @throws IllegalArgumentException if fmt is null/empty or if time is null
     */
    public String dateTimeToFmtString(LocalDateTime time, String fmt) throws IllegalArgumentException{
         if(time == null||fmt == null || fmt.isEmpty()){
            throw new IllegalArgumentException("Error with dateTimeToFmtString");
        }
        return String.valueOf(time.format(DateTimeFormatter.ofPattern(fmt)));
    }
    
    /**
     * This method takes a String and converts it into a DateTime object.
     * @param dateTime This is the String to be converted into a LocalDateTime Object
     * @return LocalDate object as a string.
     * @throws IllegalArgumentException if the dateTime is null or empty
     */
    public LocalDateTime stringToDateTime(String dateTime) throws IllegalArgumentException{
        if(dateTime == null || dateTime.isEmpty()){
            throw new IllegalArgumentException("Error with stringToDateTime");
        }
        LocalDateTime date2 = LocalDateTime.parse(dateTime);
        return date2 ;
    }
    
     /**
     * This method takes a String and converts it into a DateTime object.
     * @param date This is the String to be converted into a LocalDate Object
     * @return LocalDate object as a string.
     * @throws IllegalArgumentException if the date is null or empty
     */
    public LocalDate stringToDate(String date) throws IllegalArgumentException{
        if(date == null || date.isEmpty()){
            throw new IllegalArgumentException("Error with stringToDateTime");
        }
        LocalDate date2 = LocalDate.parse(date);
        return date2 ;
    }
    /**
     * This method takes two LocalDateTime objects and returns the difference between dates in minutes.
     * @param startDate This is the first date
     * @param endDate This is the second date
     * @return The difference between the two dates as a long
     * @throws IllegalArgumentException if the startDate or endDate is null
     */
    public long diffBetween(LocalDateTime startDate, LocalDateTime endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Error with stringToDateTime");
        }
        Long diff = Duration.between(startDate, endDate).toMinutes();
        return diff;
    }
}
