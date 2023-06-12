package in.ineuron;

import java.util.ArrayList;

/**
 * Given a set represented as a string, write a recursive code to print all
 * subsets of it. The subsets can be printed in any order.
 ** 
 * Example 1:**
 * 
 * Input :  set = “abc”
 * 
 * Output : { “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc”}
 ** 
 * Example 2:**
 * 
 * Input : set = “abcd”
 * 
 * Output : { “”, “a” ,”ab” ,”abc” ,”abcd”, “abd” ,”ac” ,”acd”, “ad” ,”b”, “bc”
 * ,”bcd” ,”bd” ,”c” ,”cd” ,”d” }
 */
public class Question_3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		String ans = "";
		String str = "abcd";
		subStrings(str, ans, list);
		System.out.println(list);
	}

	public static void subStrings(String str, String ans, ArrayList<String> list) {

		if (str.length() == 0) {
			list.add(ans);
			return;
		}
		// pick
		subStrings(str.substring(1), ans + str.charAt(0), list);
		// not pick
		subStrings(str.substring(1), ans, list);
	}
}
