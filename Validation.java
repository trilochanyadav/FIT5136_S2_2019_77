import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Write a description of class Validation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Validation
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Validation
     */
    public Validation()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean validatePassword(String newPassword)
    {
        if(newPassword.length()>=8)
        {
            Pattern upperLetter = Pattern.compile("[A-Z]");
            Pattern lowerLetter = Pattern.compile("[a-z]");
            Pattern digit = Pattern.compile("[0-9]");
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher hasUpperLetter = upperLetter.matcher(newPassword);
            Matcher hasLowerLetter = lowerLetter.matcher(newPassword);
            Matcher hasDigit = digit.matcher(newPassword);
            Matcher hasSpecial = special.matcher(newPassword);
            return hasUpperLetter.find() && hasLowerLetter.find() && hasDigit.find() && hasSpecial.find();

        }
        else
            return false;
    }

    public boolean checkEmail(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
            "[a-zA-Z0-9_+&*-]+)*@" + 
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
            "A-Z]{2,7}$"; 

        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 

    public boolean checkHallName(String[] names,String name)
    {
        for (int i = 0;i<names.length;i++)
        {
            if(names[i].equals(name))
                return true;
        }
        return false;
    }

    public int getInteger() {

        while(true){
            try {
                return Integer.parseInt(new Scanner(System.in).next());
            } catch(NumberFormatException ne) {
                System.out.print("Invalid Input!!,Please enter again");
            }
        }
    }

    public boolean validateAddress(String address)
    {
        Pattern comma = Pattern.compile(",");
        Matcher hasComma = comma.matcher(address);
        return hasComma.find();
    }

}
