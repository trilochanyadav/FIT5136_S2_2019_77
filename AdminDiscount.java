import java.util.*;
public class AdminDiscount extends Discount
{
    Administrator admin;

    public AdminDiscount()
    {
        admin = new Administrator();
    }

    public AdminDiscount(Administrator admin ,double discountRate,boolean discountState)
    {
        super(discountRate,discountState);
        this.admin = admin;
    }

    public Administrator getAdmin()
    {
        return admin;
    }

    public void setAdmin(Administrator admin)
    {
        this.admin = admin;
    }

}
