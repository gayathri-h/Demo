package javaclass;

public class Triangle extends Figure {
	
	public Triangle(double len, double bread) 
	{
		super(len, bread);

	}

	@Override
	public double area() {

		//a = 0.5*length*breadth;
		
		
		//System.out.println(0.5*length*breadth);
		return 0.5*length*breadth;
	}


	

}
