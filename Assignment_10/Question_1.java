package in.ineuron;

/***
 * Given an integer `n`, return *`true` if it is a power of three. Otherwise,
 * return `false`*.
 * 
 * An integer `n` is a power of three, if there exists an integer `x` such
 * that `n == 3x`.
 ** 
 * Example 1:**
 * 
 * ``` Input: n = 27 Output: true Explanation: 27 = 33 ```
 ** 
 * Example 2:
 **/
public class Question_1 {

	public static void main(String[] args) {
		int n = 27;
		boolean res = powerOfThree(n);
		System.out.println("Result is " + res);
	}

	public static boolean powerOfThree(int n) {

		if (n <= 0)
			return false;
		if (n == 1)
			return true;
		if (n % 3 != 0)
			return false;

		return powerOfThree(n / 3);
	}
}
