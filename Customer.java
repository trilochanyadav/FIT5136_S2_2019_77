

 import java.util.Scanner;
public class Customer
{
    

    public void customerHome()
    {
        System.out.println("*-*              Customer Home page          *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Please select an option");
        System.out.println(" 1. View all halls  ");
        System.out.println(" 2. Book A Hall  ");
        System.out.println(" 3. Manage A Booking ");
        System.out.println(" 4. Write A Review ");
        System.out.println(" 5. Logout Of System ");
        
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1: viewAllHalls();
                    break;
            case 2: bookHall();
                    break;
            case 3: manageBooking();
                    break;
            case 4: writeReview();
                    break;
        }
    }

    

    public void inforHall()
    {
        System.out.println("\f");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*             Hall information              *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*1.display hall information at here         *-*");
        System.out.println("*-*                 information               *-*");
        System.out.println("*-*                 information               *-*");
        System.out.println("*-*                                           *-*");
        System.out.println("*-*                                           *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1. Book this hall                      *-*");
        System.out.println("*-* 2. Request fot a quotation                *-*");
        System.out.println("*-* 3. see review of this hall                *-*");
        System.out.println("*-* 4. back View all hall page                *-*");
        System.out.println("*-* 5. back to Home page                      *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            bookHall();
            break;

            case 2:
            requestQuotation();
            break;

            case 3:
            inforHall();
            break;

            case 4:
            viewAllHalls();
            break;

            case 5:
            cHome();
            break;

            default:
            System.out.println("wrong enter please reenter");

        }

    }

    public void writeReview()
    {
        
        
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            inforHall();
            break;

            case 2:
            cHome();
            break;

            default:
            System.out.println("wrong enter please reenter");

        }
    }
    
    public void bookHall()
    {
        System.out.println("\f");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*                 Booking                   *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* please check the information of booking   *-*");
        System.out.println("*-* 1.display hall information at here        *-*");
        System.out.println("*-*               information                 *-*");
        System.out.println("*-*               information                 *-*");
        System.out.println("*-*               information                 *-*");
        System.out.println("*-*                                           *-*");
        System.out.println("*-*                                           *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1. Pay deposit                            *-*");
        System.out.println("*-* 2. back to information page of this hall  *-*");
        System.out.println("*-* 3. back to Home page                      *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            paySuccessful();
            break;

            case 2:
            inforHall();
            break;

            case 3:
            cHome();
            break;

            default:
            System.out.println("wrong enter please reenter");

        }
    }

    public void paySuccessful()
    {
        System.out.println("\f");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*            Pay Successful               *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1.display hall information at here      *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1.h. go to Home page                    *-*");
        System.out.println("*-* 2.m. go to My booking page              *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            cHome();
            break;

            case 2:
            myBooking();
            break;

            default:
            System.out.println("wrong enter please reenter");

        }
    }

    public void requestQuotation()
    {
        System.out.println("\f");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*        Request for a quotation          *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* please check the information of booking *-*");
        System.out.println("*-* 1.display hall information at here      *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*                                         *-*");
        System.out.println("*-*                                         *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1. submit Quotation                     *-*" );
        System.out.println("*-* 2. back to information page of this hall*-*" );
        System.out.println("*-* 3. back to Home page                    *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            requestSuccessful();
            break;
            
            case 2:
            inforHall();
            break;
            
            case 3:
            cHome();
            break;
            
            default:
            System.out.println("wrong enter please reenter");
            
        }

    }
    
    public void requestSuccessful()
    {
        System.out.println("\f");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*         Send request Successful         *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1.display hall information at here      *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*               information               *-*");
        System.out.println("*-*                                         *-*");
        System.out.println("*-*                                         *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1.h. go to Home page                    *-*");
        System.out.println("*-* 2.m. go to My booking page              *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            cHome();
            break;
            
            case 2:
            myBooking();
            break;
            
            default:
            System.out.println("wrong enter please reenter");
            
        }
    }

    public void myBooking()
    {
        System.out.println("\f");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*              MY booking               *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1.display booking information at here *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 2.display booking information at here *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 3.display booking information at here *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* Enter the number of booking to manage *-*");
        System.out.println("*-* 0.h back to Home page                 *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            manageBooking();
            break;

            case 0:
            cHome();
            break;

            default:
            System.out.println("wrong enter please reenter");
        }
    }
    
    public void manageBooking()
    {
        System.out.println("\f");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*            Manage booking             *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*1.display booking information at here  *-*");
        System.out.println("*-*        satuation of this booking      *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*                                       *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-* 1. Modify this booking                *-*");
        System.out.println("*-* 2. Cancale this booking               *-*");
        System.out.println("*-* 3. Check refund                       *-*");
        System.out.println("*-* 4. Write a review                     *-*");
        System.out.println("*-* 5.b. back to my booking page          *-*");
        System.out.println("*-* 6.h. back to Home page                *-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        int i = Integer.parseInt(c);
        switch(i)
        {
            case 1:
            manageBooking();
            break;
            
            case 2:
            manageBooking();
            break;
            
            case 3:
            manageBooking();
            break;
            
            case 4:
            manageBooking();
            break;
            
            case 5:
            myBooking();
            break;

            case 6:
            cHome();
            break;

            default:
            System.out.println("wrong enter please reenter");
        }
    }
}
