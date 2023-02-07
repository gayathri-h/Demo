package javaclass;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[3];
		
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("please enter a number");
			nums[i] = sc.nextInt();
		}
		
		for (int i = (nums.length - 1); i >= 0; i--)
			
		
		{
			System.out.println(nums[i]);	
		}
		sc.close();
}
}