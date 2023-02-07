package javaclass;

public class TestFigure {

	public static void main(String[] args) {

		Figure f = new Triangle(2, 4);
		double ta= f.area();
		System.out.println("area of triangle is "  + ta);
		
		
		Figure f1 = new Rectangle(5, 7);
		double ra =f1.area();
		System.out.println("area of rectangle is "  + ra);
	}

}
