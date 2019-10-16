import java.util.*;
public class Owner extends User
{
    private OwnerDiscount ownDiscount= new OwnerDiscount(0.0,false);
    public Owner(String newId,String newPassword,String newName,int newPhone,int newAge,boolean customerState)
    {
        super(newId,newPassword,newName,newPhone,newAge,customerState);
        ownDiscount = new OwnerDiscount(0.0,false);
    }  

    public String getOwnerDetails()
    {
        String details = getUserDetails();
        return details;
    }

}
