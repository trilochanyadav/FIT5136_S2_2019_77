import java.util.*;
public class Administrator extends User
{
    String phoneNo;

    public Administrator()
    {
        phoneNo = " ";
    }

    public Administrator(String userType,String userId,String email,String passWord,String lName,String fName, String phoneNO)
    {
        this.userType = userType;
        this.userId = userId;
        this.email = email;
        this.passWord = passWord;
        this.lName=lName;
        this.fName=fName;
        this.phoneNo = phoneNO;
    }

    public String phoneNo()
    {
        return lName;
    }

    public void phoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
}

