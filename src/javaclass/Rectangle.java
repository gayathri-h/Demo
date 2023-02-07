package javaclass;

public class Rectangle extends Figure {

	public Rectangle(double len, double bread) {
		super(len, bread);
		
		/*ar = area();
		ar = 2(len*bread);
		System.out.println("area");*/

	
	}

	@Override
	public double area() {

		//System.out.println((length*breadth));
		return length*breadth;
		
	}

}
