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
       
    public void createHall()
    {

        System.out.print('\u000C');
        Scanner console = new Scanner(System.in);
        System.out.println("*-*-*-*-Create A Hall *-*-*-*-");
        System.out.println("Plase enter the name of hall");
        String name = console.nextLine();

        System.out.println("Plase enter the address of hall");
        String  address = console.nextLine();
        System.out.println("Plase enter the size of hall in square feet");
        String input = console.nextLine();
        int size = Integer.parseInt(input);
        System.out.println("Plase enter the parking availability ");
        System.out.println("Please enter 1 if parking is available ");
        System.out.println("Please enter 2 if parking is not available ");
        int park =0;
        Scanner c4 = new Scanner(System.in);
        input= console.nextLine();
        park = Integer.parseInt(input);
        boolean parking = false;
        String parDisplay = "No";
        while(park!= 1 && park!= 2)
        {
            System.out.println("Invalid Input!!");
            System.out.println("Please enter again");
            input = c4.nextLine();
            park = Integer.parseInt(input);
        }
        if( park == 1)
        {
            parking = true ;
            parDisplay = "Yes";
        }
        if(park ==2)
        {
            parking =false;
        }
        System.out.println("Plase enter the catering availability ");
        System.out.println("Enter 1 if catering is available.");
        System.out.println("Enter 2 if no catering available.");
        input= console.nextLine();
        int  cater = Integer.parseInt(input);
        boolean catering = false;
        String catDisplay = "No";
        
        while(cater != 1 && cater!= 2)
        {
            System.out.println("Invalid Input!!");
            System.out.println("Please enter again");
            input = console.nextLine();
            cater = Integer.parseInt(input);
        }
        if( cater == 1)
        {
            catering = true ;
            catDisplay = "Yes";
        }
        if(cater ==2)
        {
            catering = false;
           
        }
        System.out.println("Plase enter maximum number of  guests hall can accomodate");
        input = console.nextLine();
        int maxGuests = Integer.parseInt(input);
        boolean more = false;
        int count = 0;
        ArrayList<String> eventTypes = new ArrayList<String>();
        do
        {
          System.out.print('\u000C');
          System.out.println("Please select the event type Hall is available for:");
         System.out.println("1. Wedding Ceremony");
         System.out.println("2. Wedding Reception");
         System.out.println("3. Birthday");
         System.out.println("4. Anniversary");
         System.out.println("Please enter the option number");
         input = console.nextLine();
        int choice = Integer.parseInt(input);
        while(choice != 1 && choice !=2 && choice != 3 && choice != 4)
        {
            System.out.println("Invalid Input,please enter again");
            input = console.nextLine();
            choice = Integer.parseInt(input);
        }
        if(choice == 1)
         eventTypes.add("WC");
        else if(choice ==2)
         eventTypes.add("WR");
        else if(choice ==3)
         eventTypes.add("BI");
        else 
          eventTypes.add("AN");
        System.out.println("Do you want to add more event type for which hall is available");
        System.out.println("Press Y/y to add more event type");
        System.out.println("Press N/n if you do  not want to add more events");
        input = console.nextLine();
        input = input.toLowerCase();
        while(!input.equals("y") && !input.equals("n"))
        {
            System.out.println("Invalid Input,Please enter again");
             input = console.nextLine();
             input = input.toLowerCase();
        }
        if(input.equals("y"))
         more = true;
        else if(input.equals("n"))
         more = false;
        
        }while(more == true && count < 4);
        
        System.out.println("Plase enter price of the hall");
        input = console.nextLine();
        int price = Integer.parseInt(input);
        while(price <= 0)
        {
            System.out.println("Price of hall cannot be less than or equal to 0");
            System.out.println("Please enter price again");
            input = console.nextLine();
            price = Integer.parseInt(input);
        }
        System.out.print('\u000C');
        System.out.println("Hall Name: " + name);
        System.out.println("Hall Address: " + address);
        System.out.println("Hall Size (in sq ft.) : " + size);
        System.out.print("Parking Availability : " + parDisplay);
        System.out.println("Catering Availability : " + catDisplay);
        System.out.println("Max guests hall can accomodate : " + maxGuests);
        for (String event : eventTypes)
        {
            System.out.println("Event Type :" + event);
        }
        System.out.println("Hall Price : " + price );
        System.out.println("Please confirm all details of hall , press Y/y to confirm");
        input = console.nextLine();
        input = input.toLowerCase();
        while (!input.equals("y"))
        {
           System.out.println("Invalid Input ,Please enter again"); 
           input = console.nextLine();
           input = input.toLowerCase();
         }
        System.out.println("Hall added successfully to the system.Congratulations !!!");
        addHall(name,address,size,parking,catering,eventTypes,maxGuests,price);
       
    }
   
    public void addHall(String name,String address,int size,boolean parking,boolean catering,ArrayList<String> events,int maxGuests,int price)
    {
       
    }
}
