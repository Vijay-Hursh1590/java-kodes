package Today;

public class Test 
{
/*	
 all arr valid: -
	public static void main(String[] args)
	public static void main(String [] args) 
	public static void main(String []args)
	public static void main(String args[])
	public static void main(String[] amity)
	public static void main(String... strings) 
*/
	public static void main(String[] args) 
	{
		System.out.println(sum(15));
	}

	
	public static int sum(int a=10, int b=20)
	{
		return a+b;
	}
	public static long multiply(int... arr)
	{
		int m = 1;
		for(int i = 1; i <= arr.length; i++)
		{
			m *= arr[i];
		}
		return m;
	}
}
