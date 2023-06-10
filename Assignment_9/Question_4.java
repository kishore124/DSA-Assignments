package in.ineuron;

/**
 * <aside> 💡 **Question 4**
 * 
 * Given a number N and a power P, the task is to find the exponent of this
 * number raised to the given power, i.e. N^P.
 ** 
 * Example 1 :**
 * 
 * Input: N = 5, P = 2
 * 
 * Output: 25
 ** 
 * Example 2 :** Input: N = 2, P = 5
 * 
 * Output: 32
 * 
 * </aside>
 */
public class Question_4 {

	public static void main(String[] args) {

		int n = 2;
		int x = 5;
		int res = findExponential(x, n);

		System.out.println("Result is " + res);
	}

	public static int findExponential(int x, int n) {

		if (n == 0)
			return 1;

		int xnm1 = findExponential(x, n - 1);
		int xn = xnm1 * x;

		return xn;
	}
}
