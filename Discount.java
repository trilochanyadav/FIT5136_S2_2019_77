import java.util.*;
public class Discount
{
    double discountRate;
    boolean discountState;

    public Discount()
    {
        double Discount = 1.0 ;
        boolean discountState= true;
    }

    public Discount(double discountRate, boolean discountState)
    {
        this.discountRate=discountRate;
        this.discountState=discountState;
    }

    public double getDiscountRate()
    {
        return discountRate;
    }

    public boolean getDiscountState()
    {
        return discountState;
    }

    public void setDiscountRate(double discountRate)
    {
        this.discountRate = discountRate;
    }

    public void setDiscountState(boolean discountState)
    {
        this.discountState = discountState;
    }

}
