import java.util.*;
public class Owner extends User
{

    private String phoneNo;
    private boolean ownerState;
    private ArrayList<Hall> ownerHalls;

    public Owner ()
    {
        phoneNo = " ";
        ownerState= true;
        ownerHalls = new ArrayList<Hall>();
    }

    public Owner(String userType,String userId,String email,String passWord,String lName,String fName, String phoneNO,boolean ownerState)
    {
        this.userType = userType;
        this.userId = userId;
        this.email = email;
        this.passWord = passWord;
        this.phoneNo = phoneNO;
        this.ownerState =ownerState;
    }

    public String phoneNo()
    {
        return lName;
    }
    public void phoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public Boolean ownerState()
    {
        return true;
    }
    public void ownerState(boolean ownerState)
    {
        this.ownerState = ownerState;
    }

}
