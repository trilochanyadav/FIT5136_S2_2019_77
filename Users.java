import java.util.*;
/**
 * Write a description of class Users here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Users
{
    // instance variables - replace the example below with your own
    private  String userID;
    private String password;

    /**
     * Constructor for objects of class Users
     */
    public Users()
    {
        // initialise instance variables
        userID = "";
        password = "";
    }

    /**
     * Welcome Menu For All Users 
     */
    public void menu()
    {
        System.out.println("*-*-Welcome To Prime Events Application*-*-");
        System.out.println("Please select an option");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        if(input == 1)
          logIn();
        else if(input == 2)
          register();
        else if(input ==0)
          System.out.println("Thanks for visiting !!!!");
        else
        {
            System.out.println("Invalid Input,please enter again");
            menu();
        
        }
    }
    
    public void logIn()
    {
        System.out.println("---------Login----------");
        System.out.println("Please enter UserId: ");
        System.out.println("Please enter Password: ");
        boolean admin = checkForAdmin(userID,password);
        boolean customer = checkForCustomer(userID,password);
        boolean owner = checkForOwner(userID,password);
    }
    
    public void register()
    {
        System.out.println("---------Register---------");
        System.out.println(" Enter Name: ");
        System.out.println(" Enter PhoneNumber:");
        System.out.println(" Enter age in years : ");
        System.out.println(" Enter Gender(Male or Female) - Please enter m for male and f for female");
        System.out.println("Enter UserID (must be 5 characters only): ");
        System.out.println("Password (must be 5 characters only) : ");
    }
    
    public boolean checkForAdmin(String Id, String pass)
    {
        boolean check = true;
        return check;
    }
    
    
    public boolean checkForCustomer(String Id,String pass)
    {
        boolean check = true;
        return check;
    }
    
    public boolean checkForOwner(String Id,String pass)
    {
        boolean check = true;
        return check;
    }
    
}
