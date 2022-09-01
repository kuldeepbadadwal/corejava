package Inheritance;

public class TestShape {
	public static void main(String[] args) {
		/*Circle c = new Circle();
        c.setColor("Black");; 
		c.setRadius(25);
		System.out.println(c.getColor());
		c.area();*/
		
		/*Rectangle r = new Rectangle();
		r.setColor("red");
		r.setLength(8);
		r.setWidth(9);
		r.area();
		System.out.println(r.getColor());*/
		
		/*Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(9);
		t.area();*/
		
		Shape s = new Triangle();
		s.setColor("blue");
		s.setBorderWidth(11);
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		
	}

}
