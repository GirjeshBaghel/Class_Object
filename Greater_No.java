//Write a program by using constructor.Create a class which implement the process of greater between 5 No 
import java.util.Scanner;
class Greater_No
{
    public Greater_No()
    {
        System.out.print("Please enter the five  numbers : ");
    	Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length;i++)
        {  
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
         for (int i = 1; i < arr.length; i++)
         {
                if (arr[i] > max)
                 max = arr[i];
         }
         System.out.println("The greatest number is :  "+max);
	}
  


    public static void main(String[] args)
    {
        Greater_No ob = new Greater_No();
    }
}