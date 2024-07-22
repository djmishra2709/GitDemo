package SeleniumCode.Demo;

import org.testng.annotations.Test;
import org.testng.reporters.XMLConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Set.*;

public class TestCases5 {


	@Test
	public void testcase2() {

		 int [] a = {1,2,3,4,5};
		 for(int i=a.length-1;i>=0;i--)
			 System.out.println(a[i]);

		}

	@Test
	public void testcase3() {

		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(1,"Dheeraj");
		map.put(2,"Arul");

		for(Integer s: map.keySet())
		{
			System.out.println(map.get(s));
		}

	}
}

