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
    private int maxGuests;
    private int discount;
    private ArrayList<String> eventType;
    private int charge;
    private String ownerId;
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
        maxGuests = 0;
        discount = 0;
        charge =0;
        eventType = new ArrayList<String>();
        ownerId = "";
    }

    public Hall(String newName,String newAddress,int newSize, boolean newParking,boolean newCatering,int newMax,int newCharge,int newDisc,ArrayList<String> types,String id)
    {
        name = newName;
        address = newAddress;
        size = newSize;
        parking = newParking;
        catering = newCatering;
        maxGuests = newMax;
        charge = newCharge;
        discount = newDisc;
        eventType = types;
        ownerId = id;
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

    public void setMaxGuests(int newMaxGuests)
    {
        maxGuests = newMaxGuests;
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

    public int getMaxGuests()
    {
        return maxGuests;
    }

    public int getCharge()
    {
        return charge;
    }

    public double getDiscount()
    {
        return discount;
    }

    public void setDiscount(int newDiscount)
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

    public String getOwnerId()
    {
        return ownerId;
    }

    public void setOwnerId(String newId)
    {
        ownerId = newId;
    }

    public String getHallDetails()
    {
        String[] thisIsAStringArray = eventType.toArray(new String[eventType.size()]);
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        for ( String element : thisIsAStringArray ) {
            if (sb.length() > 0) {
                sb.append( delimiter );
            }
            sb.append( element );
        }
        String hallevents = sb.toString();

        String det = name + "," + address + "," + size + "," + parking + "," + catering + "," + maxGuests + "," + charge + "," + discount + "," + hallevents + "," + ownerId;
        return det;
    }

    public void displayDetails()
    {
        System.out.print('\u000C');
        String available = "Yes";
        System.out.println("*-*-*-*-Hall Details*-*-*-*-");
        System.out.println("Hall Name: " + name);
        System.out.println("Hall Address: " + address);
        System.out.println("Hall Size (in sq ft.) : " + size);
        if(parking == false)
            available = "No";
        System.out.println("Parking Availability : " + available);
        available = "Yes";
        if(catering == false)
            available = "No";
        System.out.println("Catering Availability : " + available);
        System.out.println("Max guests hall can accomodate : " + maxGuests);
        for (String event : eventType)
        {
            String eventDisplay = "Anniversary";
            if(event.equals("WC"))
                eventDisplay = "Wedding Ceremony";
            else if(event.equals("WR"))
                eventDisplay = "Wedding Reception";
            else if(event.equals("BI"))
                eventDisplay = "Birthday";
            System.out.println("Available for Event Type :" + eventDisplay);
        }
        System.out.println("Hall Price (in AUD) : " + charge );

        System.out.println("Hall Discount : " + discount + " %" );
    }
}