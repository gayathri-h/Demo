package javaclass;

import java.util.Scanner;

public class ArrayDemo4largest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[3];
		System.out.println("please enter a number");
		for (int i = 0; i < nums.length; i++)
		{
			
			nums[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for (int i = 0; i < nums.length; i++)
			
		
		{
			if(max < nums[i])
			{
				max = nums[i];
			}
				
		}
		System.out.println("max value is " +max);	
		
		sc.close();
	}

}
