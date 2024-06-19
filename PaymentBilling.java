import java.util.Scanner;
class Discount
{
    float discount,amount;
    Discount(float total_amount)
    {
        amount=total_amount;
        if(total_amount>1000)
        discount=10;
        else if(total_amount>500)
        discount=5;
        else
        discount=0;
        System.out.println("You got "+discount+"% on your bill");
        Bill();
    }
    void Bill()
    {
       System.out.println("The total discount amount is "+(discount*amount)/100);
       System.out.println("The amount to be paid after discount is "+(amount-(discount*amount)/100));
    }

}
public class PaymentBilling
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n=sc.nextInt();
        float total_amount=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the price of product "+i+":");
            float price=sc.nextInt();
            total_amount+=price;
        }
        float gst=(3*total_amount)/100;        
        System.out.println("The total amount is : "+total_amount);
        total_amount+=gst;
        System.out.println("The total amount after 3% gst : "+total_amount);
        new Discount(total_amount);
        sc.close();    
        
    }
}