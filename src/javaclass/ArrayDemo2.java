package javaclass;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[3];
		
		for (int i = 0; i < nums.length; i++)	
			
		{
			System.out.println("please enter a number");
			nums[i] = sc.nextInt();
			
		}
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++)
			
		{
			
		sum = sum+ nums[i];
	}
		System.out.println("sum is " + sum);	
		
		sc.close();
	}

}
