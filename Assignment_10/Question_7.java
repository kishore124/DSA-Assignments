package in.ineuron;

/**
 * Given a string **str**, the task is to print all the permutations of **str**.
 * A **permutation** is an arrangement of all or part of a set of objects, with
 * regard to the order of the arrangement. For instance, the words ‘bat’ and
 * ‘tab’ represents two distinct permutation (or arrangements) of a similar
 * three letter word.
 ** 
 * Examples:**
 * 
 * > Input: str = “cd” > > > **Output:** cd dc > > **Input:** str = “abb” > >
 * **Output:** abb abb bab bba bab bba >
 */
public class Question_7 {

	public static void main(String args[]) {

		String s = "abb";
		String answer = "";

		System.out.print("All possible strings are : ");
		permute(s, answer);
	}

	static void permute(String s, String answer) {
		if (s.length() == 0) {
			System.out.print(answer + "  ");
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String left_substr = s.substring(0, i);
			String right_substr = s.substring(i + 1);
			String rest = left_substr + right_substr;
			permute(rest, answer + ch);
		}
	}

}
