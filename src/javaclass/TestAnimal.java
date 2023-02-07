package javaclass;

public class TestAnimal {

	public static void main(String[] args) {

		/*Animal a = new Dog();
		a.talk();
		//it is the sub class 
		*/
		
		/*Dog d = new Dog();
		d.talk();
		
		Cat c = new Cat();
		c.talk();*/
	/*	
		//AnimalProvider ap = new AnimalProvider();	//this is used when the static method is not used in the 
										//AnimalProvider class or otherwise it can be declared like that only
		*/
		
		/*
		Animal a = AnimalProvider.getAnimal("FAITHFUL");
		a.talk();
		
		((Dog) a).wagTail();//the output will come even if it is not a dog , so use instanceof
		
		
		if(a instanceof Dog)
		{
			((Dog) a).wagTail();
		}
		*/
		
	/*	for ROBUST - doesn't show exception and doesn't run
	 * if(a!= null)
		{
			a.talk();
		if(a instanceof Dog)
		{
			((Dog) a).wagTail();
		}
		}*/
	}

}



//overridding
//talk() is polymorphic- when it is overridden , it makes use of inheritance and changes accordingly