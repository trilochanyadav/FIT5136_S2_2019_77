
/**
 * Write a description of class Hall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hall
{
    // instance variables - replace the example below with your own
    private String name;
    private String address;
    private int size;
    private boolean parking;
    private boolean catering;
    private int minGuests;
    private double hallDiscount;
    /**
     * Constructor for objects of class Hall
     */
    public Hall()
    {
        // initialise instance variables
        name = "";
        address = "";
        size = 0;
        parking = false;
        catering = false;
        minGuests = 0;
    }

    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    
    public void setSize(int newSize)
    {
        size = newSize;
    }
    
    public void setParking(boolean newParking)
    {
        parking = newParking;
    }
    
    public void setCatering(boolean newCatering)
    {
        catering = newCatering;
    }
    
    public void setMinGuests(int newMinGuests)
    {
        minGuests = newMinGuests;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean getParking()
    {
        return parking;
    }
    
    public boolean getCatering()
    {
        return catering;
    }
    
    public int getMinGuests()
    {
        return minGuests;
    }
}
