package in.ineuron;

/**
 * Given first term (a), common difference (d) and a integer N of the Arithmetic
 * Progression series, the task is to find Nth term of the series.
 ** 
 * Example 1:**
 * 
 * Input : a = 2 d = 1 N = 5 Output : 6 The 5th term of the series is : 6
 ** 
 * Example 2:**
 * 
 * Input : a = 5 d = 2 N = 10 Output : 23 The 10th term of the series is : 23
 */
public class Question_6 {

	public static void main(String[] args) {

		int a = 5;
		int diff = 2;
		int n = 10;
		int res = findNthNum(a, diff, n);
		System.out.println("Result is " + res);
	}

	public static int findNthNum(int firstNum, int diff, int n) {

		if (n == 1)
			return firstNum;

		int s = findNthNum(firstNum, diff, n - 1);
		int res = s + diff;
		return res;

	}
}
