
/**
 * Write a description of class Quotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quotation
{
    // instance variables - replace the example below with your own

    private int quotationId ;
    private String customerId;
    private String ownerId;
    private int quotationAmount;
    private int noOfGuests;
    private boolean catering;
    private String hallName;
    private String quotationEvent;
    private boolean response;
    /**
     * Constructor for objects of class Quotation
     */
    public Quotation()
    {
        // initialise instance variables
        quotationId = 0;
        customerId = "";
        ownerId = "";
        quotationAmount = 0;
        noOfGuests = 0;
        catering = false;
        hallName = "";
        quotationEvent = "";
        response = true;
    }

    public Quotation(int newId,String cusId,String ownId,int newAmount,int newGuests,boolean cater,String newName,String newEvent,boolean newResponse)
    {
        quotationId = newId;
        customerId = cusId ;
        ownerId = ownId;
        quotationAmount = newAmount;
        noOfGuests = newGuests;
        catering = cater;
        hallName = newName;
        quotationEvent = newEvent;
        response = newResponse;
    }

    public int getQuotationId()
    {
        // put your code here
        return quotationId;
    }
    
    public String getQuotationEvent()
    {
        return quotationEvent;
    }

    public int getQuotationAmount()
    {
        return quotationAmount;
    }
    
    

    public String getCustomerId()
    {
        return customerId;
    }

    public String getHallName()
    {
        return hallName;
    }

    public boolean getResponse()
    {
        return response;
    }
    public boolean getCatering()
    {
        return catering;
    }
    
    public void setCatering(boolean cater)
    {
        catering = cater;
    }
    
    public void setNoOfGuests(int newGuests)
    {
        noOfGuests = newGuests;
    }
    
    public int getNoOfGuests()
    {
        return noOfGuests;
    }

    public String getOwnerId()
    {
        return ownerId;
    }
    public void setQuotationId(int newId)
    {
        // put your code here
        quotationId = newId;
    }

    public void setQuotationAmount(int newAmount)
    {
        quotationAmount = newAmount;
    }

    public void setCustomerId(String newId)
    {
        customerId = newId;
    }

    public void setHallName(String newName)
    {
        hallName = newName;
    }
    
    public void setQuotationEvent(String newEvent)
    {
        quotationEvent = newEvent;
    }

    public void setResponse(boolean newResponse)
    {
        response = newResponse;
    }
    
    public void setOwnerId(String newId)
    {
        ownerId = newId;
    }

    public String getQuotationDetails()
    {
        return(quotationId + "," + customerId + "," + ownerId + "," + quotationAmount +"," + noOfGuests + ","  + catering+ "," + hallName + "," + quotationEvent + "," +  response);   
    }

    public void displayDetails()
    {
        if(response == true)
        {
            System.out.print('\u000C');
            System.out.println("*-*-*-*-Quotation Status*-*-*-*-");
            System.out.println("Hall Name : " + hallName);
            System.out.println("Event Type : " + quotationEvent);
            System.out.println("No Of Guests : " + noOfGuests);
            String display = "Yes";
            if(catering == false)
             display = "No";
            System.out.println("Catering Provided : " + display);
            System.out.println("Quotation Amount : " + quotationAmount);
        }
        else
        {
            System.out.print('\u000C');
            System.out.println("*-*-*-*-Quotation Status*-*-*-*-");
            System.out.println("Owner has rejected the quotation request");

        }

    }
}
