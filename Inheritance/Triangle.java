package Inheritance;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle() {
		System.out.println("I am Triangle");
	}
	
	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public double area() {
		double total = (base * height) / 2;
		return total;
	}

}
