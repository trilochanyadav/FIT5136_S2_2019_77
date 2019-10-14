import java.util.*;
import java.util.concurrent.TimeUnit;
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
        halls.clear();
        owners.clear();
        customers.clear();
        bookings.clear();
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
        int validateUser = checkForUser(email,password);
        int choice = 0;
        switch(validateUser)
        {
            case 1 : 
            choice = userInterface.adminMenu();
            if(choice == 1)
                suspendAccounts();
            else if(choice == 2)
                manageAdminDiscounts();
            else 
                runApplication();
            break;
            case 2 : choice = userInterface.ownerMenu();
            if(choice == 1)
            {
                choice = userInterface.manageHallMenu();
                if(choice == 1)
                    createHall(email);
                else if(choice ==2)
                    deleteHall(email);
                else if(choice ==4)
                    runApplication();
            }
            else if(choice == 4)
                quotationResponse();
            else if(choice == 6)
                runApplication();
            break;
            case 3:   choice = userInterface.customerMenu();
            switch(choice)
            {
                case 1: viewHall(email);
                break;
                case 2: viewHall(email);
                break;
                case 3: searchHall(email);
                break;
                case 6 : runApplication();
                break;
            }
            break;
            default : System.out.println("Incorrect Email ID and password");
            System.out.println("Please enter again");
            wait(600);
            login();
            break;

        }
    }

    public int  checkForUser(String newEmail,String newPassword)
    {
        boolean isOwner = false;
        boolean isCustomer = false;
        for(Owner owner : owners)
        {
            if(owner.getUserId().equals(newEmail) && owner.getPassword().equals(newPassword))
                isOwner = true;
        }

        for(Customer customer : customers)
        {
            if(customer.getUserId().equals(newEmail) && customer.getPassword().equals(newPassword))
                isCustomer = true;
        }

        if(admin.getUserId().equals(newEmail) && admin.getPassword().equals(newPassword))
        {
            System.out.println("Login Successful");
            return 1;
        }

        else if (isOwner == true)
            return 2;
        else if(isCustomer == true)
            return 3;
        else
            return 0;
    }

    public void readCustomersFile()
    {
        FIO io = new FIO();
        String[] input = io.readData("customers.txt").split("\\n");
        if(input != null)
        {
            for(int i = 0 ;i < input.length ;i++)
            {
                try
                {
                    String[] userInput = input[i].split(",");
                    int phone = Integer.parseInt(userInput[3]);
                    int age = Integer.parseInt(userInput[4]);
                    Boolean state = Boolean.parseBoolean(userInput[5]);
                    Customer newCus = new Customer(userInput[0],userInput[1],userInput[2],phone,age,state);
                    customers.add(newCus);
                }

                catch( Exception e)
                {
                    System.out.println("Some exception has occured");
                }
            }
        }
    }

    public void readOwnersFile()
    {
        FIO io = new FIO();
        String[] input = io.readData("owners.txt").split("\\n");
        if(input != null)
        {
            for(int i = 0 ;i < input.length ;i++)
            {
                try
                {
                    String[] userInput = input[i].split(",");
                    int phone = Integer.parseInt(userInput[3]);
                    int age = Integer.parseInt(userInput[4]);
                    Boolean state = Boolean.parseBoolean(userInput[5]);
                    Owner newOwn = new Owner(userInput[0],userInput[1],userInput[2],phone,age,state);
                    owners.add(newOwn);
                }

                catch( Exception e)
                {
                    System.out.println("Some exception has occured");
                }
            }
        }
    }

    public void readHallFile()
    {
        FIO io = new FIO();
        String[] input = io.readData("halls.txt").split("\\n");
        if(input != null)
        {
            for(int i = 0 ;i < input.length ;i++)
            {
                try
                {
                    String[] userInput = input[i].split(",");
                    int len = userInput.length;
                    int size = Integer.parseInt(userInput[2]);
                    int maxGuests = Integer.parseInt(userInput[5]);
                    Boolean park = Boolean.parseBoolean(userInput[3]);
                    Boolean cater = Boolean.parseBoolean(userInput[4]);
                    int price = Integer.parseInt(userInput[6]);
                    int disc = Integer.parseInt(userInput[7]);
                    ArrayList<String> events = new ArrayList<String>();
                    for (int j = 8;j < len-1;j++)
                    {
                        events.add(userInput[j]);   
                    }

                    Hall newHall = new Hall(userInput[0],userInput[1],size,park,cater,maxGuests,price,disc,events,userInput[len-1]);
                    halls.add(newHall);

                }

                catch( Exception e)
                {
                    System.out.println("Some exception has occured");
                }
            }
        }
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
        System.out.println("Please enter your name :");
        String name = console.nextLine();
        System.out.println("Please enter your 10 digit phone number :");
        int phoneNo = 0;
        int age = 0;
        input = console.nextLine();
        while (input.length() != 10)
        { 
            System.out.println("Invalid input!! . Please enter phoneNo again");
            input = console.nextLine();
        }
        phoneNo = Integer.parseInt(input);
        System.out.println("Please enter your age in years :");
        input = console.nextLine();
        age = Integer.parseInt(input);
        boolean state = true;
        while(age <=0)
        {
            System.out.println("Invalid input!! . Please enter phoneNo again");
            input = console.nextLine();
            age =  Integer.parseInt(input);
        }
        if(userType == 1)
            System.out.println(" Customer Account created successfully!!");
        else
            System.out.println(" Owner Account created successfully!!");
        if(userType == 1)
        {
            Customer newCus = new Customer(email,password,name,phoneNo,age,state);
            customers.add(newCus);
            writeCustomerFile();
        }
        else
        {
            Owner newOwn = new Owner(email,password,name,phoneNo,age,state);
            owners.add(newOwn);
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

    public void writeCustomerFile()
    {
        String[] data = new String[customers.size()];
        for(int i = 0;i < customers.size();i++)
        {
            Customer newCus = customers.get(i);
            data[i] = newCus.getCustomerDetails();

        }
        FIO io = new FIO();
        io.setData(data,"customers.txt");
    }

    public void writeOwnerFile()
    {
        String[] data = new String[owners.size()];
        for(int i = 0;i < owners.size();i++)
        {
            Owner newOwn = owners.get(i);
            data[i] = newOwn.getOwnerDetails();

        }
        FIO io = new FIO();
        io.setData(data,"owners.txt");
    }

    public void writeHallFile()
    {
        String[] data = new String[halls.size()];
        for(int i = 0;i < halls.size();i++)
        {
            Hall newHall = halls.get(i);
            data[i] = newHall.getHallDetails();

        }
        FIO io = new FIO();
        io.setData(data,"halls.txt");

    }

    public void createHall(String ownerId)
    {
        System.out.print('\u000C');
        Scanner console = new Scanner(System.in);
        ArrayList<String> hallNames = new ArrayList<String>();;
        for (Hall newHall : halls)
        {
            hallNames.add(newHall.getName());
        }
        String[] names = hallNames.toArray(new String[hallNames.size()]);

        System.out.println("*-*-*-*-Create A Hall *-*-*-*-");
        System.out.println("Please enter the name of hall");
        String name = console.nextLine();
        boolean check = validate.checkHallName(names,name);
        while(check == true)
        {
            System.out.println("Hall name is already present in the system.Please enter other name");
            name = console.nextLine();
            check = validate.checkHallName(names,name);
        }validate.checkHallName(names,name);
        System.out.println("Please enter the address of hall,Don't enter comma(,) in the address");
        String  address = console.nextLine();
        while (validate.validateAddress(address) == true)
        {
            System.out.println("Please enter the address of hall again,Don't enter comma(,) in the address");
            address = console.nextLine();
         }
            
        System.out.println("Please enter the size of hall in square feet");
        
        int size = validate.getInteger();
        System.out.println("Please enter the parking availability ");
        System.out.println("Please enter 1 if parking is available ");
        System.out.println("Please enter 2 if parking is not available ");
        
        Scanner c4 = new Scanner(System.in);
        int park = validate.getInteger();
        boolean parking = false;
        String parDisplay = "No";
        while(park!= 1 && park!= 2)
        {
            System.out.println("Invalid Input!!");
            System.out.println("Please enter again");
            park = validate.getInteger();
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
        System.out.println("Please enter the catering availability ");
        System.out.println("Enter 1 if catering is available.");
        System.out.println("Enter 2 if no catering available.");
        
        int cater = validate.getInteger();
        boolean catering = false;
        String catDisplay = "No";

        while(cater != 1 && cater!= 2)
        {
            System.out.println("Invalid Input!!");
            System.out.println("Please enter again");
            
            cater = validate.getInteger();
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
        System.out.println("Please enter maximum number of  guests hall can accomodate");
        
        int maxGuests = validate.getInteger();
        while(maxGuests <= 0)
        {
            System.out.println("Price of hall cannot be less than or equal to 0");
            System.out.println("Please enter price again");
             maxGuests = validate.getInteger();
        }
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
            
            int choice = validate.getInteger();
            while(choice != 1 && choice !=2 && choice != 3 && choice != 4)
            {
                System.out.println("Invalid Input,please enter again");
                
                choice = validate.getInteger();
            }
            if(choice == 1 && !eventTypes.contains("WC"))
                eventTypes.add("WC");
            else if(choice == 2 && !eventTypes.contains("WR"))
                eventTypes.add("WR");
            else if(choice == 3 && !eventTypes.contains("BI"))
                eventTypes.add("BI");
            else if(choice == 4 && !eventTypes.contains("AN")) 
                eventTypes.add("AN");
            else
                System.out.println("The event type has already been added to the hall");
            System.out.println("Do you want to add more event type for which hall is available");
            System.out.println("Press Y/y to add more event type");
            System.out.println("Press N/n if you do  not want to add more events");
            String input = console.nextLine();
            input = input.toLowerCase();
            while(!input.equals("y") && !input.equals("n"))
            {
                System.out.println("Invalid Input,Please enter again");
                input = console.nextLine();
                input = input.toLowerCase();
            }
            if(input.equals("y"))
            {
                more = true;
                count++;
            }
            else if(input.equals("n"))
                more = false;

        }while(more == true && count < 4);

        System.out.println("Please enter price of the hall");
        
        int price = validate.getInteger();
        while(price <= 0)
        {
            System.out.println("Price of hall cannot be less than or equal to 0");
            System.out.println("Please enter price again");
            
            price = validate.getInteger();
        }
        System.out.println("Please enter discount percentage available for hall");
        
        int discount = validate.getInteger();
        while(discount < 0 || discount > 100)
        {
            System.out.println("Discount must be between 0 and 100");
            System.out.println("Please enter discount again");
            discount = validate.getInteger();
        }
        Hall newHall = new Hall(name,address,size,parking,catering,maxGuests,price,discount,eventTypes,ownerId);
        newHall.displayDetails();
        System.out.println("Please confirm all details of hall , press Y/y to confirm");
        System.out.println("Press Y/y to confirm , Press N/n to enter hall details again");
        String input = console.nextLine();
        input = input.toLowerCase();
        while (!input.equals("y") && !input.equals("n"))
        {
            System.out.println("Invalid Input ,Please enter again"); 
            input = console.nextLine();
            input = input.toLowerCase();
        }
        if(input.equals("y"))
        {
            System.out.println("Hall added successfully to the system.Congratulations !!!");

            halls.add(newHall);
            writeHallFile();
            System.out.println("Press 1 to Go Back To Main Menu");
            System.out.println("Press 2 to Logout");
           
            int integerInput = validate.getInteger();
            while(integerInput!= 1 && integerInput != 2)
            { 
                System.out.println("Invalid Input ,Please enter again");
                
                integerInput = validate.getInteger();
            }
            if(integerInput ==1) 
            {
                int ownerInput = userInterface.ownerMenu();
                switch(ownerInput)
                {
                    case 1 : manageHalls(ownerId);
                    break;
                    case 4:  quotationResponse();
                    break;
                    default : System.out.println("Incorrect Input");
                }
            }

            else 
            {
                runApplication();
            }
        }
        else
        {
            createHall(ownerId);
        }

    }

    public void deleteHall(String ownerId)
    {
        System.out.print('\u000C');
        Scanner console = new Scanner(System.in);
        System.out.println("*-*-*-*-Delete A Hall *-*-*-*-");
        ArrayList<String> names = new ArrayList<String>();
        boolean check = false;
        for ( Hall newHall : halls)
        {
            if(newHall.getOwnerId().equals(ownerId))
            {
                names.add(newHall.getName());
            }
        }
        int count = 1;
        for(String name : names)
        {
            System.out.println(count + ": " + name);
            count++;
        }
        System.out.println("Enter the number corresponding to hall you want to delete");
        String input = console.nextLine();
        int choice = Integer.parseInt(input);
        System.out.print('\u000C');
        String selectedHall = names.get(choice - 1);
        System.out.println("Your selected hall is : " + selectedHall);
        System.out.println("Press Y/y to add delete this hall");
        System.out.println("Press N/n if you do not want to delete this hall and go back to Manage Hall Menu");
        input = console.nextLine();
        input = input.toLowerCase();
        while(!input.equals("y") && !input.equals("n"))
        {
            System.out.println("Invalid Input,Please enter again");
            input = console.nextLine();
            input = input.toLowerCase();
        }
        if(input.equals("y"))
        {
            int index = 0;
            for(Hall newHall : halls)
            { 
                if(newHall.getName().equals(selectedHall))
                {
                    index = halls.indexOf(newHall); 
                    break;
                }

            }
            halls.remove(index);
            writeHallFile();
            System.out.println("Hall deleted successfully!!!");
            System.out.println("Press 1 to go back to Manage Hall Menu");
            System.out.println("Press 2 to logout");
            input = console.nextLine();
            choice = Integer.parseInt(input);
            while(choice != 1 && choice !=2)
            {
                System.out.println("Invalid Input.Please enter again");
                input = console.nextLine();
                choice = Integer.parseInt(input);

            }
            if(choice == 2)
                runApplication();
            else 
                manageHalls(ownerId);
        }
    }

    public void manageHalls(String ownerId)
    {
        int ownerInput = userInterface.manageHallMenu();
        boolean check = true;
        switch(ownerInput)
        {
            case 1 : createHall(ownerId);
            break;
            case 2: deleteHall(ownerId);

            break;
            default : System.out.println("Invalid Input!!!,Please enter again");
            manageHalls(ownerId);
            break;

        }
    }

    public void quotationResponse()
    {
    }

    public void suspendAccounts()
    {
    }

    public void manageAdminDiscounts()
    {
    }

    public void searchHall(String newEmail)
    {
        System.out.print('\u000C');
        Scanner console = new Scanner(System.in);
        System.out.println("*-*-*-*Search A Hall*-*-*-*-");
        System.out.println("Please enter the name of hall you want to search");
        String input = console.nextLine();
        boolean found = false;
        for(Hall newHall : halls)
        {
            if(newHall.getName().equals(input)){
                newHall.displayDetails();
                found = true;
            }
        }
        if(found == false)
        {
            System.out.println("No hall with that name exists");
        }
        System.out.println("Press 1 to Search A Hall");
        System.out.println("Press 2 to  Go Back To Main Menu");
        System.out.println("Press 3 to Logout");
        input = console.nextLine();
        int choice = Integer.parseInt(input);

        while(choice < 1 && choice > 3)
        {
            System.out.println("Invalid Input!!!,Please enter again");
            input = console.nextLine();
            choice = Integer.parseInt(input);

        }
        if(choice ==1)
            searchHall(newEmail);
        else if(choice == 2)
        {
            choice = userInterface.customerMenu();
            switch(choice)
            {
                case 1: 
                case 2: viewHall(newEmail);
                break;
                case 3: searchHall(newEmail);
                break;
                case 5 : checkResponse(newEmail);
                break;
                case 7 : runApplication();
                break;
                default : System.out.println("Option under implementation");
                break;
            }
        }

        else
            runApplication();

    }

    public void viewHall(String newEmail)
    {
        System.out.print('\u000C');
        Scanner console = new Scanner(System.in);
        System.out.println("*-*-*-*-View All Halls *-*-*-*-");
        int count = 1;
        for(Hall newHall : halls)
        {
            System.out.println(count + ". Name :  " + newHall.getName());
            System.out.println(" Address : " + newHall.getAddress());
            count++;

        }
        System.out.println("Enter the number corresponding to the hall to view it's details");
        String input = console.nextLine();
        int choice = Integer.parseInt(input);
        while(choice < 1 && choice > count)
        {
            System.out.println("Invalid Input!!!,Please enter again");
            input = console.nextLine();
            choice = Integer.parseInt(input);

        }
        Hall newHall = halls.get(choice-1);
        newHall.displayDetails();
        System.out.println("Press 1 to Book this hall");
        System.out.println("Press 2 to View All Halls");
        System.out.println("Press 3 to  Go Back To Main Menu");
        System.out.println("Press 4 to Logout");
        input = console.nextLine();
        choice = Integer.parseInt(input);

        while(choice < 1 && choice > 5)
        {
            System.out.println("Invalid Input!!!,Please enter again");
            input = console.nextLine();
            choice = Integer.parseInt(input);

        }
        if(choice == 1)
            bookHall(newHall,newEmail);
        else if(choice ==2)
            viewHall(newEmail);
        else if(choice == 3)
        {
            choice = userInterface.customerMenu();
            switch(choice)
            {
                case 1: 
                case 2: viewHall(newEmail);
                break;
                case 3: searchHall(newEmail);
                break;
                case 6 : runApplication();
                break;
            }
        }

        else
            runApplication();

    }

    public void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void checkResponse(String newEmail)
    {
    }

    public void bookHall(Hall newHall,String newEmail)
    {
        System.out.print('\u000C');
        Scanner console = new Scanner(System.in);
        System.out.println("*-*-*-*-Select Event Of Booking*-*-*-*-");
        ArrayList<String> events = newHall.getEventType();
        int count = 1;
        for (String event : events)
        {
            String eventDisplay = "Anniversary";
            if(event.equals("WC"))
                eventDisplay = "Wedding Ceremony";
            else if(event.equals("WR"))
                eventDisplay = "Wedding Reception";
            else if(event.equals("BI"))
                eventDisplay = "Birthday";
            System.out.println(count + " : " + eventDisplay);
            count++;
        }
        System.out.println("Please select the number corresponding to the event type:");
        int choice = validate.getInteger();
        while(choice <1 && choice > count)
        {
            System.out.println("Invalid Input!!!,Please enter again");
            choice = validate.getInteger();
        }
        String event = "Wedding Ceremony";
        
        if(events.get(choice-1).equals("WR"))
         event = "Wedding Reception";
        else if(events.get(choice-1).equals("AN"))
         event = "Anniversary";
        else if(events.get(choice-1).equals("BI"))
         event = "Birthday";        
        System.out.print('\u000C');
        System.out.println("*-*-*-*-Book Hall*-*-*-*-");
        System.out.println("Hall Name : " + newHall.getName());
        System.out.println("Hall Address : " + newHall.getName());
        System.out.println("Event Type : " + event);
        System.out.println("Hall Price in AUD : $" + newHall.getCharge());
        System.out.println("Discount Percentage on Hall : " + newHall.getDiscount() + " %");
        Double amount  =  newHall.getDiscount()* newHall.getCharge();
        int price = (int)Math.round(amount);
        System.out.println("Discount Amount  on Hall in AUD : $ " + price);
        amount  =  newHall.getCharge() - (newHall.getDiscount()* newHall.getCharge());
        price = (int)Math.round(amount);
        System.out.println("Final Price in AUD: $" + price);
        System.out.println("Press Y/y to pay ");
        System.out.println("Press N/n if you want to ask owner for quotation");
        String input = console.nextLine();
        input = input.toLowerCase();
        while(!input.equals("y") && !input.equals("n"))
        {
            System.out.println("Invalid Input,Please enter again");
            input = console.nextLine();
            input = input.toLowerCase();
        }
        if(input.equals("y"))
        {
            System.out.print('\u000C');
            System.out.println("*-*-*-*-Make Payment*-*-*-*-");
            System.out.println("Please pay AUD $" + price);
            
            int payment = validate.getInteger();
            while(payment != price)
            {
                System.out.println("Invalid amount!! Please pay again");
                payment = validate.getInteger();
            }
            System.out.println("Payment Successful!!!");
            wait(600);
            printReceipt(newHall,newEmail,payment,events.get(choice-1));
        }
        else
        {
            askQuotation(newHall,newEmail);
        }
    }

   
    

    public void printReceipt(Hall newHall,String newEmail,int amount ,String event)
    {
        System.out.print('\u000C');
        System.out.println("*-*-*-*-Booking Receipt*-*-*-*-");
        System.out.println("Hall Name : " + newHall.getName());
        System.out.println("Hall Address : " + newHall.getAddress());
        System.out.println("Event Type : " + event);
        System.out.println("Booking Date : " );

    }

    public void askQuotation(Hall newHall,String newEmail)
    {
    }

}
