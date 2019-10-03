import java.util.*;
import java.io.*;
/**
 * Write a description of class Hall here.
 *
 * @Trilochan Yadav,Zonghao Dai,Yuxu Chen
 * @1.0 (30.09.2019)
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
    private double discount;
    private ArrayList<String> eventType;
    private int charge;
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
        discount = 0.00;
        eventType = new ArrayList<String>();
    }
   
    public void Hall(String newName,String newAddress,int newSize, boolean newParking,boolean newCatering,int newMin,int newCharge, ArrayList<String> types)
    {
        name = newName;
        address = newAddress;
        size = newSize;
        parking = newParking;
        catering = newCatering;
        minGuests = newMin;
        charge = newCharge;
        discount = 0.00;
        eventType = types;
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
   
    public double getDiscount()
    {
        return discount;
    }
   
    public void setDiscount(double newDiscount)
    {
        discount = newDiscount;
    }
   
    public void setCharge(int newCharge)
    {
        charge = newCharge;
    }
   
    public void setEventType(ArrayList<String> newTypes)
    {
        eventType = newTypes;
    }
   
    public ArrayList<String> getEventType()
    {
        return eventType;
    }
    
    
}