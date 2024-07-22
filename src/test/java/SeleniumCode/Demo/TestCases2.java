package SeleniumCode.Demo;

import org.testng.annotations.Test;

public class TestCases2 {
	
	@Test
	public void testcase2()
	{
		String s="A man, a plan, a canal: Panama";
		Boolean flag = false;
		String newstr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		StringBuffer b = new StringBuffer(newstr);

		if(s==null)
			System.out.println("null");

		else{
			if(b.reverse().toString().equals(newstr))
				System.out.println("true");
		}

		}


}
