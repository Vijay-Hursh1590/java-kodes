package myPackage;

public class Square {
 private double side;

/**
 * @return the side
 */
public double getSide() {
	return side;
}

/**
 * @param side the side to set
 */
public void setSide(double side) {
	this.side = side;
}

public double area() {
	return side * side;
}
 
}
