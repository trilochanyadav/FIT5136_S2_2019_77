import java.util.*;
public class Admin extends User
{
    public Admin ()
    {
        super("admin@monash.com","Monash@123","trilochan",1234567890,24,true);

    }

    public String getAdminDetails()
    {
        String details = getUserDetails();
        return details;
    }
    
    public void suspendAccounts()
    {
        System.out.println("Option under implementation");
}
     
     public void manageAdminDiscounts()
     {
         System.out.println("Option under implementation");
        }
}


