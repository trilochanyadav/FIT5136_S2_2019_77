import java.util.*;
public class Admin extends User
{
    String phoneNo;

    public Admin()
    {
        phoneNo = " ";
    }

    public Admin(String userType,String userId,String email,String passWord,String lName,String fName, String phoneNO)
    {
        this.userType = userType;
        this.userId = userId;
        this.email = email;
        this.passWord = passWord;
       
        this.phoneNo = phoneNO;
    }

    
    public void phoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
}

