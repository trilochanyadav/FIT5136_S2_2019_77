import java.util.*;
/**
 * Write a description of class Owner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Owner
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Owner
     */
    public Owner()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void ownerMenu()
    {
        System.out.println("*-*-Welcome Owner*-*-");
        System.out.println("Please select an option");
        System.out.println("1. Manage Halls");
        System.out.println("2. Manage Discount");
        System.out.println("3. Manage A Booking");
        System.out.println("4. Respond to Quotation Request");
        System.out.println("5. Manage Payment");
        System.out.println("6. Logout");
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        switch(input)
        {
            case 1 : manageHalls();
                     break;
            case 2 : manageDiscount();
                     break;
            case 3 : manageBooking();
                     break;
            case 4 : responseToQuotation();
                     break;
            case 5 : managePayment();
                     break;
            case 6 : System.out.println("Logged out successfully");
                     System.out.println("Thanks for visiting");
                     break;
            default : System.out.println("Invalid Input. Please enter again");
                      ownerMenu();
                      break;
                      
         }
       }
       
       public void manageHalls()
       {
           System.out.println("Please select an option");
           System.out.println("1. Create Halls");
           System.out.println("2. Modify existing hall details");
           System.out.println("3. Go Back To Owner Home Menu");
           System.out.println("0. Logout");
           Scanner console = new Scanner(System.in);
           int input = console.nextInt();
           switch(input)
        {
            case 1 : createHall();
                     break;
            case 2 : modifyHall();
                     break;
            case 3 : ownerMenu();
                     break;
            case 4 : System.out.println("Logged out successfully");
                     break;
            default : System.out.println("Invalid Input. Please enter again");
                      manageHalls();
                      break;
                      
         }
        }
        
       public void createHall()
       {
           System.out.println("*-*-Enter Hall Details*-*-");
           System.out.println("Enter hall name");
           System.out.println("Enter size of hall (in square feet) :");
           System.out.println("Enter type of event hall is available for ,please select from below options");
           System.out.println("1.Wedding ceremony");
           System.out.println("2. Wedding reception");
           System.out.println("3. Birthday");
           System.out.println("4. Anniversary");
           Scanner console = new Scanner(System.in);
           int input = console.nextInt();
           while(input < 1 || input >4)
           {
               System.out.println("Please enter again");
               input  = console.nextInt();
           }
           System.out.println("Enter parking availablity(Y/N)");
           String parking = console.next();
           System.out.println("Enter minimum number of guests hall can accomodate");
           int min = console.nextInt();
           System.out.println("Enter maximum number of guests hall can accomodate");
           int max = console.nextInt();
           System.out.println("Enter hall address");
           String address = console.nextLine();
           System.out.println("Enter catering availablity(Y/N)");
           String cater = console.nextLine();
           System.out.println("Hall created successfully");
           System.out.println("Please select an option");
           System.out.println("1. Continue managing halls");
           System.out.println("2. Go back to owner home menu");
           System.out.println("3. Log out");
        }
        
        public void modifyHall()
        {
            System.out.println("*-*-Modify Hall Details*-*-");
        }
        
        public void manageDiscount()
        {
            System.out.println("*-*-Manage Hall Discounts*-*-");
            System.out.println("Please select an option");
            System.out.println("1. Modify discount");
            System.out.println("2. Create discount");
            System.out.println("3. Delete discount");
            System.out.println("4. Go back to owner home menu");
            System.out.println("0. Logout");
            Scanner console = new Scanner(System.in);
            int input = console.nextInt();
           
        }
        
        public void manageBooking()
        {
        }
        
        public void responseToQuotation()
        {
        }
        
        public void managePayment()
        {
        }
}
