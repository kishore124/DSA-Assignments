package in.ineuron;

/**
 * <aside> 💡 **Question 5**
 * 
 * Given an array of integers **arr**, the task is to find maximum element of
 * that array using recursion.
 ** 
 * Example 1:**
 * 
 * Input: arr = {1, 4, 3, -5, -4, 8, 6}; Output: 8
 ** 
 * Example 2:**
 * 
 * Input: arr = {1, 4, 45, 6, 10, -8}; Output: 45
 * 
 * </aside>
 */
public class Question_5 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 4, 3, -5, -4, 8, 6 };
		int res = maxOfArray(arr, 0);
		System.out.println("Result is " + res);
	}

	static int maxOfArray(int arr[], int i) {

		if (i == arr.length - 1)
			return arr[i];
		int res = maxOfArray(arr, i + 1);
		if (arr[i] > res)
			return arr[i];
		else
			return res;

	}

}
