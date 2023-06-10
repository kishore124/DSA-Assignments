package in.ineuron;

/**
 * Given an array, find a product of all array elements.
 ** 
 * Example 1:**
 * 
 * Input : arr[] = {1, 2, 3, 4, 5} Output : 120 Example 2:**
 * 
 * Input : arr[] = {1, 6, 3} Output : 18
 */
public class Question_8 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1,2,3,4,5,6 };
		int res = sumOfArr(arr, 0);

		System.out.println("Result is " + res);
	}

	public static int sumOfArr(int arr[], int i) {
		if (i == arr.length - 1)
			return arr[i];
		int res = sumOfArr(arr, i + 1);
		return res * arr[i];
	}

}
