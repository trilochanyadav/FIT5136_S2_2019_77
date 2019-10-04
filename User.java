import java.util.*;
public class User
{
    String userId;
    String password;
    String name;
    int phoneNo;
    int age;
    boolean state;

    public User()
    {
        userId = "";
        password = "";
        name = "";
        phoneNo = 0;
        age = 0;
        state = true;
    }

    public User(String newId,String newPass,String newName,int newNo,int newAge,boolean newState)
    {
        userId = newId;
        password = newPass;
        name = newName;
        phoneNo = newNo;
        age = newAge;
        state = newState;

    }

    public String getUserId()
    {
        return userId;
    }

    public String getPassword()
    {
        return password;
    }

    public String getName()
    {
        return name;
    }

    public int getPhoneNo()
    {
        return phoneNo;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getState()
    {
        return state;
    }

    public void setUserId(String newId)
    {
        userId = newId;
    }

    public void setPassword(String newPass)
    {
        password = newPass;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setPhoneNo(int newNo)
    {
        phoneNo = newNo;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void setState(boolean newState)
    {
        state = newState;
    }

    public String getUserDetails()
    {
        return(userId + "," + password + "," + name + "," + phoneNo + "," + age  + "," + state);
    }
}

