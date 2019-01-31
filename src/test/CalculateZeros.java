package test;

import java.util.Scanner;

public class CalculateZeros
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        
        System.out.println("Enter two numbers. Remember that n1 must be less than n2!");
        
        do
        {
            System.out.print("Input: ");
            
            n1=scanner.nextInt();
            n2=scanner.nextInt();
        
        } while (n1>n2);
        
       int result=checkForZeros(n1,n2);
       
       printMessage(result);
    }
    
    public static int checkForZeros(int min, int max)
    {
        int counter=0;
        String str;
        
        while (min<=max)
        {
            str = Integer.toString(min);
            
            for (int i=0;i<str.length();i++)
            {
                if (str.charAt(i)=='0')
                {
                    counter++;
                }
            }
            
            min++;
        }

        return counter;
    }
    
    public static void printMessage(int counter)
    {
        System.out.println("Number of 0s: "+counter);
    }
}