package calculator;

public class CalculatorFull 
{
  static int num1;
  static int num2;
  public static void main(String args[])
  {
    CalculatorFull obj1 = new CalculatorFull();
    int ans = CalculatorFull.sum(10, 20);
    System.out.println("Sum : " + ans);
    num1 = 100;
    System.out.println("num1 : " + num1);
    //Calculator obj2 = new Calculator();
    System.out.println("Num2: " + num2);


    
 
  }
  

  public static int sum(int a, int b)
  {
    return a+b;
  }

  


  CalculatorFull()
  {
    num2 = 1000;
  }


  {
    num2 = 100;
  } 

  


  static
  {
    System.out.println("this is static block");
  }
	
	
  {
    System.out.println("this is non-static block");
  }
	
	
	

}
