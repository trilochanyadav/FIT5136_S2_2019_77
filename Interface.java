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
    Validation validate;

    /**
     * Constructor for objects of class Interface
     */
    public Interface()
    {
        // initialise instance variables
        validate = new Validation();
    }

    public int  startMenu()
    {
        System.out.println("*-*-*-*-Welcome to Prime Events*-*-*-*-");
        System.out.println("Please select an option:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. View Halls");
        System.out.println("4. Exit Application");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);
        int input = validate.getInteger();
        while(input < 1 || input > 4 )
        {
            System.out.println("Invalid Input,Please enter again");

            input = validate.getInteger();
        }
        return input;

    }

    public int ownerMenu()
    {
        System.out.print('\u000C');
        System.out.println("*-*-*-*-Welcome to Owner Menu*-*-*-*-");
        System.out.println("Please select an option:");
        System.out.println("1. Manage Halls");
        System.out.println("2. Manage Discounts");
        System.out.println("3. Manage Bookings");
        System.out.println("4. Respond To  Quotation Requests");
        System.out.println("5. Manage Payments");
        System.out.println("6. Logout");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);
        int input = validate.getInteger();

        while(input < 1 || input > 6)
        {
            System.out.println("Invalid Input,Please enter again");
            input = validate.getInteger();
        }
        return input;
    }

    public int customerMenu()
    {
        System.out.print('\u000C');
        System.out.println("*-*-*-*-Welcome to Customer Menu*-*-*-*-");
        System.out.println("Please select an option:");
        System.out.println("1. Book A Hall");
        System.out.println("2. View All Halls");
        System.out.println("3. Search A Hall");
        System.out.println("4. Manage Bookings");
        System.out.println("5. Check for Quotation Response");
        System.out.println("6. Write Review");
        System.out.println("7. Logout");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);
        int input =  validate.getInteger();
        while(input < 1 || input > 7)
        {
            System.out.println("Invalid Input,Please enter again");
            input = validate.getInteger();
        }
        return input;
    }

    public int adminMenu()
    {
        System.out.println('\u000C');
        System.out.println("*-*-*-*-Welcome to Admin Menu*-*-*-*-");
        System.out.println("Please select an option:");
        System.out.println("1. Suspend/Deactivate Users");
        System.out.println("2. Manage Discounts");
        System.out.println("3. Logout");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);
        int input = validate.getInteger();
        while(input !=1 && input != 2)
        {
            System.out.println("Invalid Input,Please enter again");
            input = validate.getInteger();
        }
        return input;
    }

    public int manageHallMenu()
    {
        System.out.print('\u000C');
        System.out.println("*-*-*-*-Welcome to Manage Halls Menu*-*-*-*-");
        System.out.println("Please select an option:");
        System.out.println("1. Create A Hall");
        System.out.println("2. Delete A Hall");
        System.out.println("3. Modify Hall Details");
        System.out.println("4. Logout");
        System.out.println("Please enter the option number");
        Scanner console = new Scanner(System.in);

        int input = validate.getInteger();
        while(input < 1 || input > 4)
        {
            System.out.println("Invalid Input,Please enter again");
            input = validate.getInteger();
        }
        return input;
    }
}
