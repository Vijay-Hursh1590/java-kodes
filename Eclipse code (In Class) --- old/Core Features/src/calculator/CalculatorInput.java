package calculator;

import java.util.Scanner;

class CalculatorInput
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number : ");
    int n1 = sc.nextInt();
    System.out.println("Enter 2nd number : ");
    int n2 = sc.nextInt();
    int res = sum(n1, n2);
    System.out.println("Sum : " + res);
    sc.close();
  }

 public static int sum(int a, int b)
  {
    return a+b;
  }

}

