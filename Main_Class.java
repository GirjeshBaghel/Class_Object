//Write a program by using class and object.First class do the process of sum of digit and fibonacci series.Second class use the method of first class.
import java.util.Scanner;
class Main_Class
{
   int num,digit,num2,n3,count,sum=0;
    Scanner sc = new Scanner(System.in);
    public void sum()
    {
        System.out.print("Enter the digit to sum : ");
    
        num = sc.nextInt();
        while(num>0)
        {
            digit = num%10;
            sum += digit;
            num = num/10;
        }
        System.out.println("Sum of Digit is : "+sum);
    }
   
    public void fibo()
    {       
        System.out.print("Please enter the two value for Fibonacci Series : ");
        num = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(" Your starting value is : "+num+"   Your Ending value is : "+num2);
        System.out.println("Please enter the Counting value : ");
        count = sc.nextInt();
        for(int i=2 ; i<count; ++i)
        {
            n3 = num+num2;
            System.out.print(" "+n3);
            num = num2;
            num2 = n3;
        }
    }
    
    public static void main(String[] args)
    {
        
    }
}
