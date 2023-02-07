package javaclass;

public class AnimalProvider {

	public static Animal getAnimal(String type)
	{
		if(type.equals("FAITHFUL"))
		{
			return new Dog();
		}
		else if(type.equals("CUTE"))
		{
			return new Cat();
		}
		else 
		{
			return null;
		}

		
	}

}
//overridding