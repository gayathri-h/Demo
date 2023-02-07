package javaclass;

public class Student {				//encapsulation method
	
	//instance variables
	private int rollNo;
	private String name;
	
	private String lastName;
	
	private static int objCount;
	//if it is not static , it will be stored in heap and each memory has it's own count.
	//so static makes it to store in memory, so it is shared among all the objects in the heap.
	//static gives the total memory count and it will be counting as we insert the objects.
	
	public Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
		objCount++;
		// System.out.println("Inside 2 Arg Const");	- studarraydemo gets the problem
	}
	
	public Student(int rollNo, String name, String lastName)
	{
		this(rollNo,name);
		this.setLastName(lastName);
		System.out.println("Inside 3 Arg Const");
	}
	
	
	public static int getObjCount() {
		
	//instance variables can't be declared inside static refernce
		//System.out.println(this.rollNo);
		//gives error where rollNo has to be changed to static and this operator can't be used
		return objCount;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void printinfo()
	{
		System.out.println("Roll no: " + rollNo + " Name: " + name + lastName);
	}
	

}

//encapsulation method where it makes certain statements private and gives restricted access