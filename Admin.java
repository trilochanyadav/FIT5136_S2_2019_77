import java.util.*;
public class Admin extends User
{
    public Admin ()
    {
        super("tyad0002@student.monash.edu","Mangos@123","trilochan",1234567890,24,true);

    }

    public String getAdminDetails()
    {
        String details = getUserDetails();
        return details;
    }
}

