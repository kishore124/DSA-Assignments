package in.ineuron;

/**
 * <aside> 💡 **Question 8**
 * 
 * Given a string, count total number of consonants in it. A consonant is an
 * English alphabet character that is not vowel (a, e, i, o and u). Examples of
 * constants are b, c, d, f, and g.
 ** 
 * Examples :** Input : abc de Output : 3 There are three consonants b, c and d.
 * 
 * Input : geeksforgeeks portal Output : 12 </aside>
 */
public class Question_8 {

	public static void main(String[] args) {

		int count = 0;
		int n = 0;
		String str = "geeksforgeeks portal";
		int res = numberOfConsonants(str, n, count);
		System.out.println(res);
	}

	public static int numberOfConsonants(String str, int n, int count) {
		if (n == str.length())
			return count;

		if (str.charAt(n) != 'a' && str.charAt(n) != 'e' && str.charAt(n) != 'i' && str.charAt(n) != 'o'
				&& str.charAt(n) != 'u' && str.charAt(n) != ' ')
			count++;
		return numberOfConsonants(str, n + 1, count);

	}
}
