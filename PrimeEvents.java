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
    private ArrayList<Customer> customers;
    private ArrayList<Owner> owners;
    private Admin admin;
    private Interface userInterface;
    private Validation validate;
    
    /**
     * Constructor for objects of class PrimeEvents
     */
    public PrimeEvents()
    {
        // initialise instance variables
        halls = new ArrayList<Hall>();
        bookings = new ArrayList<Booking>();
        customers = new ArrayList<Customer>();
        owners = new ArrayList<Owner>();
        admin = new Admin();
        userInterface = new Interface();
        validate = new Validation();
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
        Scanner console = new Scanner(System.in);
        readCustomersFile();
        readOwnersFile();
        readHallFile();
        int input = userInterface.startMenu();
        do
        {
          switch(input)
          {
            case 1 :  login();
                      break;
            case 2 :  register();
                      break;
            default : System.out.println("Please enter the option number again");
                      String inputAgain = console.nextLine();
                      input = Integer.parseInt(inputAgain);
                      break;
          }
        }while(input!= 1 || input != 2);
    }
    
    public void login()
    {
      System.out.print('\u000C');
      System.out.println("*-*-*-*-Welcome To Login Option*-*-*-*-");
      System.out.println("Please enter your email ID:");
      Scanner console = new Scanner(System.in);
      String email = console.nextLine();
      System.out.println("Please enter your password:");
      String password = console.nextLine();
      boolean validateUser = checkForUser(email,password);
      
      
    }
    
    public boolean checkForUser(String newEmail,String newPassword)
    {
        return false;
    }
    
    public void readCustomersFile()
    {
    }
    
   
     public void readOwnersFile()
    {
    }
    
    public void readHallFile()
    {
    }
    
    public void addOwner()
    {
    }
    
    public void addCustomer()
    {
    }
    
   public void register()
    {
        System.out.print('\u000C');
        System.out.println("*-*-*-*-Welcome To Registration Option*-*-*-*-");
        System.out.println("Please select an option");
        System.out.println("1. Register As Customer");
        System.out.println("2. Register As Owner");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int integerInput = Integer.parseInt(input);
        while(integerInput!= 1 && integerInput!= 2)
        {
            System.out.println("Invalid Input!!");
            System.out.println("Please enter again");
            input = console.nextLine();
            integerInput = Integer.parseInt(input);
        }
        int userType = integerInput;
        String password = "";
        System.out.println("Please enter your email ID:");
        String email = console.nextLine();
        boolean result = validate.checkEmail(email);
        while(result == false)
        {
            System.out.println("Please enter email ID again as it is not a valid email ID");
            email = console.nextLine();
            result = validate.checkEmail(email);
        }
        
        System.out.println("Please enter your password");
        password = console.nextLine();
        while(password.length() < 8)
        {
            System.out.println("Error , Password must be atleast 8 characters long");
            System.out.println("Please enter the password again:");
            password = console.nextLine();
        }
        result =  validate.validatePassword(password);
        if(result == false)
        {
          System.out.println("Password must be atleast 8 characters long and contain 1 uppercase,1 lowercase and 1 special character and 1 number");
          do
          {
             System.out.println("Please enter password again :");
             password = console.nextLine();
             result = validate.validatePassword(password);
           }while(result == false);
        
          
        }
        System.out.println("Account created successfully!!");
        if(userType == 1)
        {
          addCustomer(email,password);
          writeCustomerFile();
        }
        else
        {
          addOwner(email,password);
          writeOwnerFile();
        }
        
        System.out.println("Please select an option:");
        System.out.println("1. Go back to Main Menu");
        System.out.println("2. Exit Application");
        System.out.println("Please enter the option number");
        input = console.nextLine();
        integerInput = Integer.parseInt(input);
        while(integerInput!= 1 && integerInput!= 2)
        {
            System.out.println("Invalid Input!!");
            System.out.println("Please enter again");
            input = console.nextLine();
            integerInput = Integer.parseInt(input);
        }
        if(integerInput ==1)
          runApplication();
        else
          System.exit(0);
        
       }
      
   public void addOwner(String newEmail,String newPassword)
      {
        
        }
        
      public void addCustomer(String newEmail,String newPassword)
      {
        }
        
      public void writeCustomerFile()
      {
        }
      
      public void writeOwnerFile()
      {
       
       }
}
