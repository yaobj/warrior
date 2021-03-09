package warrior;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {

		String s = "abcdefg";

		System.out.println(s.substring(s.indexOf("d") + 1));
		System.out.println(s.substring(0, s.indexOf("d")));
	}

	class Solution {

		public int lengthOfLongestSubstring(String s) {

			int result = 0;
			Set<Character> set = new HashSet<Character>();

			char[] sss = s.toCharArray();
			result = sss.length > 0 ? 1 : 0;
			String sonResult = "";
			for (char ss : sss) {

				if (set.contains(ss)) {
					result = result > sonResult.length() ? result : sonResult.length();
					clearSet(set, sonResult.substring(0, sonResult.indexOf(String.valueOf(ss)) + 1));
					sonResult = sonResult.substring(sonResult.indexOf(String.valueOf(ss)) + 1);
				}
				sonResult = sonResult + String.valueOf(ss);
				set.add(ss);
			}
			result = result > sonResult.length() ? result : sonResult.length();
			return result;
		}
	}

	public void clearSet(Set<Character> set, String s) {

		char[] ss = s.toCharArray();
		set.removeAll(Arrays.asList(ss));

	}

}
