package javaclass;

public abstract class Figure {	//abstract is for like customization
	
	protected double length;
	protected double breadth;
	
	public Figure(double len, double bread)
	{
		this.length = len;
		this.breadth = bread;
	}
	
	public abstract double area();

}
