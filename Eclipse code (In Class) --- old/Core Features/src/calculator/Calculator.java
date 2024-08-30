package calculator;

public class Calculator
{

  public static void main(String args[])
  {
    Calculator obj1 = new Calculator();
    int ans = obj1.sum(10, 20);
    System.out.println("Sum : " + ans);
  }
  

  public static int sum(int a, int b)
  {
    return a+b;
  }
    
}


