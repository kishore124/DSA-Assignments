package in.ineuron;

/**
 * Given a number n, find the sum of the first natural numbers.
 ** 
 * Example 1:**
 * 
 * Input: n = 3
 * 
 * Output: 6
 ** 
 * Example 2:**
 * 
 * Input : 5
 * 
 * Output : 15
 */
public class Question_2 {

	public static void main(String[] args) {

		int n = 5;
		int res = sumOfNaturalNumbers(n);
		System.out.println("Result is " + res);
	}

	public static int sumOfNaturalNumbers(int n) {
		if (n == 1)
			return 1;
		return n + sumOfNaturalNumbers(n - 1);
	}
}
