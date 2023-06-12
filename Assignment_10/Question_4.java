package in.ineuron;

/**
 * Given a string calculate length of the string using recursion.
 ** 
 * Examples: Input : str = "abcd" Output :4
 * 
 * Input : str = "GEEKSFORGEEKS" Output :13
 ***/
public class Question_4 {

	public static void main(String[] args) {

		int i = 0;
		int len = 0;
		String str = "GEEKSFORGEEKS";
		int res = lengthOfString(str, len, i);
		System.out.println("Result is " + res);
	}

	public static int lengthOfString(String str, int len, int i) {
		if (i == str.length())
			return len;
		len++;
		return lengthOfString(str, len, i + 1);
	}
}
