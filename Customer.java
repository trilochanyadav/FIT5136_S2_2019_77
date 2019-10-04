public class Customer extends User
{

    public Customer (String newId,String newPassword,String newName,int newPhone,int newAge,boolean customerState)
    {
        super(newId,newPassword,newName,newPhone,newAge,customerState);

    }

    public String getCustomerDetails()
    {
        String details = getUserDetails();
        return details;
    }
}
