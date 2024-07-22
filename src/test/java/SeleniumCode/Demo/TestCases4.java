package SeleniumCode.Demo;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TestCases4 {
	@Test
	public void testcase1() {
		//Initialize array
		int [] arr = new int [] {1, 2, 3, 4, 5};
		//n determine the number of times an array should be rotated.
		int n = 2;

		//Displays original array
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(arr));

		//Rotate the given array by n times toward right
		for(int i = 0; i < n; i++){
			int j, last;
			//Stores the last element of array
			last = arr[arr.length-1];

			for(j = arr.length-1; j > 0; j--){
				//Shift element of array by one
				arr[j] = arr[j-1];
			}
			//Last element of array will be added to the start of array.
			arr[0] = last;
		}
		System.out.println("Array after right rotation: ");
		System.out.println(Arrays.toString(arr));

	}
	}

