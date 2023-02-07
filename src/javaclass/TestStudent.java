package javaclass;			//encapsulation

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(101, "anil", "kumar");
	 //student -user defined, s1- refernce variable, new - operator, student()- default constructor
		
		//student is like the blueprint which is the main one, s1 is the object in the main blueprint.
		//new is the similar copy which is aligned on the same blueprint
		
		//s1.rollNo = 101;
		//-s1.setRollNo(101);
		//s1.name = "Anil";
		//-s1.setName("Anil");
		
		//System.out.println(s1.getRollNo());
		//System.out.println(s1.getName());
		
		//s1.printinfo();
		
		//System.out.println(Student.getObjCount());
		
		//Student s2 = new Student(102,"Anirudh");
		//s2.printinfo();
		
		//System.out.println(Student.getObjCount());
		
	}

}
