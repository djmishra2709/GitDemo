package SeleniumCode.Demo;

import org.testng.annotations.Test;
import org.testng.reporters.XMLConstants;

public class TestCases {
	@Test
	public void testcase1() {
        String haystack ="Sagarika";
		String needle ="agar";

			// Base condition
			if (haystack == null || needle == null) {
				System.out.println("null");
			}
			// Special case
			if (haystack.equals(needle)) {
				System.out.println("same string");
			}
			// length of the needle
			int needleLength = needle.length();
			// Loop through the haystack and slide the window
			for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
				// Check if the substring equals to the needle
				if (haystack.substring(i, i + needleLength).equals(needle)) {
					System.out.println("string found at:"+i);
					return;
				}
			}
		System.out.println("string not found");
		}
	}

