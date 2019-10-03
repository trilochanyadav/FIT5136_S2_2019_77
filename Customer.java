public class Customer extends User
{
    String phoneNo;
    boolean customerState;

    public Customer()
    {
       phoneNo = " ";

       customerState= true;
    }

    public Customer (String newId,String newPassword,String newName,String passWord,int phoneNo,int newAge,boolean customerState)
    {
        super(userType, userId,email,passWord,lName,fName);
        this.phoneNo = phoneNO;
        this.customerState =customerState;
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

    public String getCustomerDetails()
    {
        String details = email + "," + password + "," + name + "," + phoneNo + "," + age + "," + state;
        return details;
    }
}
