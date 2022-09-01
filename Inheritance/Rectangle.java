package Inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle() {
		System.out.println("I am Rectangle");
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		double total = length * width;
		return total;
	}

}
