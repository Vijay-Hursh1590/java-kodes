package myPackage;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java");
		
		Hello obj = new Hello();

		Square sq = new Square();
		sq.setSide(12.67);
		System.out.println("side:" +sq.getSide());
		
		System.out.println("Area: "+sq.area());
	}

}
