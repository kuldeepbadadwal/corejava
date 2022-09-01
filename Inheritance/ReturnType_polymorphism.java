package Inheritance;

public class ReturnType_polymorphism {
	
	public Shape getShape(int i) {
			if (i==1) return new Rectangle();
			if (i==2) return new Circle();
			if (i==3) return new Triangle();
			return null;
		}
	}
