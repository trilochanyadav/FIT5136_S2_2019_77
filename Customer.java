import java.util.*;
public class Customer extends User
{
    private ArrayList<Review> reviews;
    
    public Customer (String newId,String newPassword,String newName,int newPhone,int newAge,boolean customerState)
    {
        super(newId,newPassword,newName,newPhone,newAge,customerState);
        reviews = new ArrayList<Review>();
    }

    
    public String getCustomerDetails()
    {
        String details = getUserDetails();
        return details;
    }
    
    public void addReview()
    {
    }
    
    public void seeReviews()
    {
    }
}
