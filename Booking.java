import java.util.*;
/**
 * Write a description of class Booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Booking
{
    // instance variables - replace the example below with your own
    private int bookingId;
    private int bookingAmount;
    private boolean checkForCancel;
    private String customerId;
    private String hallName;
    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {
        // initialise instance variables
        bookingId  = 0;
        bookingAmount = 0;
        checkForCancel = false;
        customerId="";
        hallName ="";

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

    public void setCheckForCancel(boolean newCheck)
    {
        checkForCancel = newCheck;
    }
    public boolean getCheckForCancel()
    {
        return checkForCancel;
    }

    public void setHallName(String hallName)
    {
        this.hallName = hallName;
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
}