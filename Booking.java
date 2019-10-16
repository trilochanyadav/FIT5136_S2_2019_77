import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Booking
{
    // instance variables - replace the example below with your own
    private  int bookingId ;
    private int bookingAmount;
    private int noOfGuests;
    private boolean whetherCater;
    private String customerId;
    private String hallName;
    private String bookingEvent;
    private String bookingDate ;
    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {
        // initialise instance variables
        bookingId = 0;
        bookingAmount = 0;
        noOfGuests = 0;
        whetherCater = false;
        customerId="";
        hallName ="";
        bookingEvent = "";
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        bookingDate = df.format(new Date());

    }

    public Booking(int newId,int amount,int newGuests,boolean check,String cusId,String name,String newEvent,String newDate)
    {
        bookingId = newId;
        bookingAmount = amount;
        noOfGuests = newGuests;
        whetherCater = check;
        customerId = cusId;
        hallName = name;
        bookingEvent = newEvent;
        bookingDate = newDate;

    }

    public String getBookingDate()
    {
        return bookingDate;   
    }

    public void setBookingDate(String newDate)
    {
        bookingDate = newDate;
    }

    public void setBookingId(int newBookingId)
    {
        bookingId = newBookingId;
    }

    public int getBookingId()
    {
        return bookingId;
    }

    public void setBookingAmount(int newBookingAmount)
    {
        bookingAmount = newBookingAmount;
    }

    public int getBookingAmount()
    {
        return bookingAmount;
    }

    public void setWhetherCater(boolean newCheck)
    {
        whetherCater = newCheck;
    }

    public boolean getWhetherCater()
    {
        return whetherCater;
    }

    public void setHallName(String hallName)
    {
        this.hallName = hallName;
    }

    public void setBookingEvent(String newEvent)
    {
        bookingEvent = newEvent;
    }

    public String getHallName()
    {
        return hallName;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public String getBookingEvent()
    {
        return bookingEvent;
    }
    
    public int getNoOfGuests()
    {
        return noOfGuests;
    }
    
    public void setNoOfGuests(int newGuests)
    {
        noOfGuests = newGuests;
    }

    public String getBookingDetails()
    {
        return(bookingId + "," + bookingAmount + "," + noOfGuests + "," + whetherCater + "," + customerId + "," + hallName  + "," + bookingEvent + ","+ bookingDate);
    }
}