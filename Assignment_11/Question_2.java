package in.ineuron;

/**
 * <aside> 💡 **Question 2**
 * 
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * Given a **0-indexed** integer array `nums`, find a peak element, and return
 * its index. If the array contains multiple peaks, return the index to **any of
 * the peaks**.
 * 
 * You may imagine that `nums[-1] = nums[n] = -∞`. In other words, an element is
 * always considered to be strictly greater than a neighbor that is outside the
 * array.
 * 
 * You must write an algorithm that runs in `O(log n)` time.
 * 
 * Input: nums = [1,2,1,3,5,6,4] Output: 5 Explanation: Your function can return
 * either index number 1 where the peak element is 2, or index number 5 where
 * the peak element is 6.
 */
public class Question_2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 4, 5, 6, 7, 8, 6, 3, 2, 1 };
		int res = peakElement(arr);
		System.out.println("Result is " + res);
	}

	public static int peakElement(int[] arr) {

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > arr[mid + 1])
				high = mid;
			else
				low = mid + 1;

		}
		return low;
	}
}
