import java.util.*;
public class Owner extends User
{
    public Owner(String newId,String newPassword,String newName,int newPhone,int newAge,boolean customerState)
    {
        super(newId,newPassword,newName,newPhone,newAge,customerState);

    }  

    public String getOwnerDetails()
    {
        String details = getUserDetails();
        return details;
    }

}
