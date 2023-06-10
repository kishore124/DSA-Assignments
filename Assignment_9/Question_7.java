package in.ineuron;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string S, the task is to write a program to print all permutations of
 * a given string.
 ** 
 * Example 1:**
 *** 
 * Input:***
 * 
 * S = “ABC”*
 *** 
 * Output:***
 * 
 * “ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”*
 ** 
 * Example 2:**
 *** 
 * Input:***
 * 
 * S = “XY”*
 *** 
 * Output:***
 * 
 * “XY”, “YX”
 **/
public class Question_7 {

	public static void main(String[] args) {

		String str = "abc";
		List<String> res = permute(str);
		System.out.println(res);
	}

	public static List<String> permute(String str) {
		List<String> res = new ArrayList<String>();
		permuteHelper(str, 0, str.length() - 1, res);
		return res;
	}

	public static void permuteHelper(String str, int left, int right, List<String> res) {
		if (left == right) {
			res.add(str);
			return;
		} else {
			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				permuteHelper(str, left + 1, right, res);
				str = swap(str, left, i); // backtrack
			}
		}
	}

	public static String swap(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
