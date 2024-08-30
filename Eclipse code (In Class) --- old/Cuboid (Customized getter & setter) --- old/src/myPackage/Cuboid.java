// Customized getter and setter

package myPackage;

public class Cuboid {
	private double length;
	private double breadth;
	private double height;
	
	public String getLength() {
		return this.length + "meters";
	}
	
	public String getBreadth() {
		return this.breadth + "meters";
	}
	
	public String getHeight() {
		return this.height + "meters";
	}
	
	public boolean setLength(double length) {
		if(length >= 1.0) {
			this.length = length;
			return true;
		}
		
		return false;
	}
	
	public boolean setBreadth(double breadth) {
		if(breadth >= 1.0) {
			this.breadth = breadth;
			return true;
		}
		
		return false;
	}
	
	public boolean setHeight(double height) {
		if(height >= 1.0) {
			this.height = height;
			return true;
		} 
		return false;
	}
	
	// Method to calculate volume
	public double volume() {
		return this.length * this.breadth * this.height;
	}
	
	// Override toString method to return a string representation of the object
	public String toString() {
		String s = String.format("Length: %.2f meters\nBreadth: %.2f meters\nHeight: %.2f meters\nVolume: %.2f cubic meters", 
			getLength(), getBreadth(), getHeight(), volume());
		return s;
	}
}