package javaclass;

public class Dog extends Animal{


	public void talk(){
		
		super.talk();
		
		System.out.println("bow waw!");
	}
	
	public void wagTail(){
		
		System.out.println("Wag Tail");
	}

	@Override
	public void eat() {

		System.out.println("Eats pedigree");
	}
	
	
	
	
	}



//overridding