//Write a program by using class and object.First class do the process of sum of digit and fibonacci series.Second class use the method of first class.
import java.util.Scanner;
class Main_Class
{
   // class level variable
   int num,r,num2,n3,count,sum=0;
    Scanner sc = new Scanner(System.in);
    
   // this method is calling from another class
   public void sum()
    {
      
      // taking the digit of no from user
        System.out.print("Enter the digit to sum : ");
    
        num = sc.nextInt();
      // checking no is greater than zero or not
       while(num>0)
        {
            r = num%10;
            sum += r;
            num = num/10;
        }
      // printing the sum of digit
        System.out.println("Sum of Digit is : "+sum);
    }
   
   // fibonacci series method is calling from other class
    public void fibo()
    {    
       // taking two values from user
        System.out.print("Please enter the two value for Fibonacci Series : ");
        num = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(" Your starting value is : "+num+"   Your Ending value is : "+num2);
        System.out.println("Please enter the Counting value : ");
        count = sc.nextInt();
       
        for(int i=2 ; i<count; ++i)
        {
           // first and second value sum transfer in another variable
            n3 = num+num2;
            System.out.print(" "+n3);
           
           // inter changing the values 
           num = num2;
            num2 = n3;
        }
    }
    
   // main method
    public static void main(String[] args)
    {
        
    }
}
