package allCalculator;

import java.util.Scanner;


public class Calculator 
{

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter 1st number : ");
	    double n1 = sc.nextDouble();
	    System.out.println("Enter 2nd number : ");
	    double n2 = sc.nextDouble();
	    System.out.println("Enter what to perform among the 4 fundamental operations (sum, diff, mult, div): ");
	    String opt = sc.next();
	    if (opt.equals("sum"))
	    {
		    System.out.println("Sum : " + sum(n1, n2));
	    }
	   	    
	    else if (opt.equals("diff"))
	    {
		    System.out.println("Difference : " + diff(n1, n2));
	    }
	    
	    else if (opt.equals("mult"))
	    {
		    System.out.println("Product : " + mult(n1, n2));
	    }
	   
	    else if (opt.equals("div"))
	    {
		    System.out.println("Quotient : " + div(n1, n2));
	    }

	    else
	    {
		    System.out.println("Invalid Entry \n(Your Entry must be among - 'sum', 'diff', 'mult' or 'div')");
	    }
	    
	    
	    sc.close();
	}
	
	public static double sum(double a, double b)
	{
	    return a+b;
	}
	
	public static double diff(double a, double b)
	{
	    return a-b;
	}
	
	public static double mult(double a, double b)
	{
	    return a*b;
	}
	
	public static double div(double a, double b)
	{
	    return a/b;
	}
	
	


}


