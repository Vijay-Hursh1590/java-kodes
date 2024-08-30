package cuboid1;

public class Cuboid {

	private double length;
	private double breadth;
	private double height;
	
	Cuboid()
	{
		System.out.println("Zero parameter Constructor");
	}
	
	Cuboid(double unit)
	{
		this();
		System.out.println("One parameter Constructor");
		this.length = unit;
		this.breadth = unit;
		this.height= unit;
		
	}
	public double volume()
	{
		return this.length * this.breadth * this.height;
	}
	
	Cuboid(double length, double breadth, double height)
	{
		this(length);
		System.out.println("3 parameter Constructor");
		this.length = length;
		this.breadth = breadth;
		this.height= height;
		
	}
	
	{
		System.out.println("Instance");
	}
	
	
	static {
		System.out.println("Static");
	}
	
//	void Cuboid()
//	{
//		System.out.println("method");
//	}
	
	
	/*
	public static void main(String[] args) {
		
	}

    */
}
