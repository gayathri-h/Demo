package javaclass;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] nums = new int[3];
		
		nums[0] = 99;
		nums[1] = 22;
		nums[2] = 44;
		
		// System.out.println(nums[1]);
		// System.out.println(nums[2]);
		// here if int is there =0, string gives null and float gives 0.1 result is array value isn't given
		// if it exceeds array number it gives exception.
		
		for (int i = 0; i < nums.length; i++)
			// int i- initialisation, i < nums - iteration and valuation, i++ is the increment
		{
			System.out.println(nums[i]);
		}
	}

}

