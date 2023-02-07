package javaclass;

import java.util.Scanner;

public class StudArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Student[] studs = new Student[3];
		
		/*studs[0] = new Student(101, "Anil");
		studs[1] = new Student(102, "Ankit");
		
		
		for(Student s : studs)
		{
			if(s != null)
			{
				s.printinfo();
			}
		}*/
		
		for(int i=0; i < studs.length; i++)
		{
			System.out.println("please enter the rollNo");
			int rollNo = sc.nextInt();
			sc.nextLine();			//dummy read to exhaust \r\f
			System.out.println("please enter the name");
			String name = sc.nextLine();
			
			
			studs[i] = new Student(rollNo, name);
		}
		
		System.out.println("please enter name to search");
		String SearchName = sc.nextLine();
		
		Student foundStud = null;
		for(Student s : studs)
		{
			if(s != null && s.getName().equals(SearchName))
			{
				foundStud = s;
				break;
			}
		}
		
		if(foundStud != null)
		{
			System.out.println(SearchName + " Student found");
			foundStud.printinfo();
		}
		else
		{
			System.out.println("Sorry" + SearchName + " student not found");
		}
		sc.close();
	}

}
