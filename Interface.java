import java.util.*;
/**
 * Write a description of class Interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interface
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Interface
     */
    public Interface()
    {
        // initialise instance variables
        x = 0;
    }

    public int  startMenu()
    {
        System.out.println("*-*-*-*-Welcome to Prime Events*-*-*-*-");
        System.out.println("Please select an option:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int integerInput = Integer.parseInt(input);
        return integerInput;
        
    }
    
    
    
   
    

}
