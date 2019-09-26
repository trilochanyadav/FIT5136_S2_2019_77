public class Customer extends User
{
    String phoneNo;
    boolean customerState;

    public Customer()
    {
        phoneNo = " ";

       customerState= true;
    }

    public Customer (String userType,String userId,String email,String passWord,String lName,String fName, String phoneNO,boolean ownerState)
    {
        super(userType, userId,email,passWord,lName,fName);
        this.phoneNo = phoneNO;
        this.customerState =ownerState;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public Boolean getCustomerState()
    {
        return true;
    }
    public void setCustomerState(boolean customerState)
    {
        this.customerState = customerState;
    }

}
