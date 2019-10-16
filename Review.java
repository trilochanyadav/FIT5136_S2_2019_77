
/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    // instance variables - replace the example below with your own
    private String description;

    /**
     * Constructor for objects of class Review
     */
    public Review()
    {
        // initialise instance variables
        description = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDescription(String newDescription)
    {
        description = newDescription;
    }
    
    public String getDescription()
    {
        return description;
    }
}
