package in.ineuron;

/**
 * We are given a string S, we need to find count of all contiguous substrings
 * starting and ending with same character.
 ** 
 * Examples : Input : S = "abcab" Output : 7 There are 15 substrings of "abcab"
 * a, ab, abc, abca, abcab, b, bc, bca bcab, c, ca, cab, a, ab, b Out of the
 * above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b.
 * 
 * Input : S = "aba" Output : 4 The substrings are a, b, a and aba
 */
public class Question_5 {

	static int countSubstrs(String str, int i, int j, int n) {
		// base cases
		if (n == 1)
			return 1;
		if (n <= 0)
			return 0;

		int res = countSubstrs(str, i + 1, j, n - 1) + countSubstrs(str, i, j - 1, n - 1)
				- countSubstrs(str, i + 1, j - 1, n - 2);

		if (str.charAt(i) == str.charAt(j))
			res++;

		return res;
	}

	public static void main(String[] args) {
		String str = "abcab";
		int n = str.length();
		System.out.print("Result is " + countSubstrs(str, 0, n - 1, n));
	}

}
