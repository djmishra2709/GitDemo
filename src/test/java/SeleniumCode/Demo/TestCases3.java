package SeleniumCode.Demo;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TestCases3 {
	
	@Test(enabled = false)
	public void testcase3()
	{
		int[] nums = {9,2,3,3,4,6};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; ++i) {
			//Checking the adjacent element for equality
			if (nums[i] == nums[i + 1])
				System.out.println("dublicate num :"+nums[i]);
		}

	}

	@Test
	public void testcase4()
	{
	String s1="";
		int[] digits ={1,2,3};
		for(int i=0;i<digits.length;i++)
		{
			s1 = s1+ digits[i];
		}

		System.out.println(s1);
		int b = Integer.parseInt(s1)+1;
		System.out.println(b);

		String s=Integer.toString(b);
		int[] newGuess = new int[s.length()];
		for (int i = 0; i < s.length(); i++)
		{
			newGuess[i] = s.charAt(i) - '0';
		}

		System.out.println(newGuess);
	}
}

