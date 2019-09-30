import java.util.*;
/**
 * Write a description of class PrimeEvents here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeEvents
{
    // instance variables - replace the example below with your own
    private ArrayList<Hall> halls;
    private ArrayList<Booking> bookings;
    private ArrayList<User> users;

    /**
     * Constructor for objects of class PrimeEvents
     */
    public PrimeEvents()
    {
        // initialise instance variables
        halls = new ArrayList<Hall>();
        bookings = new ArrayList<Booking>();
        users = new ArrayList<User>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void runApplication()
    {
        // put your code here
        System.out.print('\u000C');
        System.out.println("*-*-*-*-Welcome to Prime Events*-*-*-*-");
        System.out.println("Please select an option:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int integerInput = Integer.parseInt(input);
        do
        {
          switch(integerInput)
          {
            case 1 : login();
                     break;
            case 2 : register();
                     break;
            default : System.out.println("Please enter the option number again");
                      input = console.nextLine();
                      integerInput = Integer.parseInt(input);
                      break;
          }
        }while(integerInput != 1 || integerInput != 2);
        
    }
    
    public void login()
    {
     System.out.print('\u000C');
     System.out.println("*-*-*-*-Welcome To Login Option*-*-*-*-");
     
    }
    
    public void register()
    {
      System.out.print('\u000C');
      System.out.println("*-*-*-*-Welcome To Registration Option*-*-*-*-");
      
    }
}
