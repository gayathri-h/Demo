package javaclass;

import java.util.Scanner;

public class StudArrayDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] studs = new Student[3];
		int index = 0;
		String choice = "";
		
		
		do
		{
			System.out.println("please select your choice");
			System.out.println("1.Add student to the array");
			System.out.println("2.Display all the students");
			System.out.println("3.Search a student");
			System.out.println("4.Delete a student");
			System.out.println("5.Exit");
			
			choice = sc.next();
			
			switch(choice){
			case"1":
				//for(int i=0; i < studs.length; i++)
				//{
					System.out.println("please enter the rollNo");
					int rollNo = sc.nextInt();
					sc.nextLine();		
					System.out.println("please enter the name");
				
					String name = sc.nextLine();
					
					
					studs[index] = new Student(rollNo, name);
					index++;
				//}

				System.out.println("added successfully");
				break;
				
			case"2":
				for(Student s : studs)
				{
					if(s != null)
					{
						s.printinfo();
					}
				}
				break;
				
			case "3":
				System.out.println("please enter the name to search");
				String searchName = sc.next();
				
				Student foundStud = null;
				for(Student s : studs)
				{
					if(s != null && s.getName().equals(searchName))
					{
						foundStud = s;
						break;
					}
				}
				
				if(foundStud != null)
				{
					System.out.println(searchName + " Student found");
					foundStud.printinfo();
				}
				else
				{
					System.out.println("Sorry " + searchName + " student not found");
				}
					break;
					
			case "4":
				System.out.println("please enter the name to delete");
				String delName = sc.next();
				
				//Student delStud = null;
				for(Student s : studs)
				{
					if(s != null && s.getName().equals(delName))
					{
						for(int i = 0; i < studs.length; i++)
						{
							studs[i] =  null;
							break;
						}
						
					}
				}
				
				if(delName != null)
				{
					System.out.println(delName + " Student deleted");
				}
				else
				{
					System.out.println("Sorry " + delName + " student not deleted");
				}
				
					break;
					
			case"5":
				System.out.println("application exiting");
				break;
				default:
					System.out.println("invalid choice");
					break;
				
			}
			
				
			
	}while(!choice.equals("5"));
		
		sc.close();
	}

}
