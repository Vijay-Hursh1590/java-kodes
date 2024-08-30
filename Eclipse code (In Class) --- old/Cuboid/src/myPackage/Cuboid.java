package myPackage;

public class Cuboid {
	static double length;
	static double breadth;
	static double height;
	
	public double volume()
	{
		return length*breadth*height;
	}
	
	public boolean isCuboid()
	{
		if (length>0 && breadth>0 && height>0 && (length == breadth && breadth == height && length == height))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	public static double getLength() {
		return length;
	}


	public static void setLength(double length) {
		Cuboid.length = length;
	}


	public static double getBreadth() {
		return breadth;
	}


	public static void setBreadth(double breadth) {
		Cuboid.breadth = breadth;
	}


	public static double getHeight() {
		return height;
	}


	public static void setHeight(double height) {
		Cuboid.height = height;
	}


	public static void main(String args[])
	{
		Cuboid obj = new Cuboid();
		double res = obj.volume();
		System.out.println("Volume : " + res);
		System.out.println(obj.isCuboid());
		
	}
	
	
}
