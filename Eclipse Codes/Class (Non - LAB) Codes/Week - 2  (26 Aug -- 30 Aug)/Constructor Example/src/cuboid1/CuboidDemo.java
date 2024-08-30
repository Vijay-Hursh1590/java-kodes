package cuboid1;

public class CuboidDemo {

	public static void main(String[] args) {
		// c.Cuboid();
		Cuboid c = new Cuboid();
		
		Cuboid c1 = new Cuboid(2.4);
		Cuboid c3 = new Cuboid(3.5, 7.0, 10);
		
		System.out.println(c.volume());
		System.out.println(c1.volume());
		System.out.println(c3.volume());

		
	}

}
