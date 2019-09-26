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
    private ArrayList<Payment> payments;
    private boolean checkForCancel;
    

    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {
        // initialise instance variables
        bookingId  = 0;
        bookingAmount = 0;
        payments = new ArrayList<Payment>();
        checkForCancel = false;
        
    }

    public void setBookingId(int newBookingId)
    {
        bookingId = newBookingId;
    }
    
    public void setbookingAmount(int newBookingAmount)
    {
        bookingAmount = newBookingAmount;
    }
    
    public void setCheckForCancel(boolean newCheck)
    {
        checkForCancel = newCheck;
    }
}
