import java.util.*;
public class OwnerDiscount extends Discount
{
    Owner owner;
    public OwnerDiscount()
    {
        owner = new Owner();
    }

    public OwnerDiscount(Owner owner,double discountRate, boolean discountState)
    {
        super(discountRate,discountState);
        this.owner = owner;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

}
