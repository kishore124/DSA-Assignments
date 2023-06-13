package in.ineuron;

/**
 * Given an array of integers `nums` containing `n + 1` integers where each
 * integer is in the range `[1, n]` inclusive.
 * 
 * There is only **one repeated number** in `nums`,
 * return *this repeated number*.
 * 
 * You must solve the problem **without** modifying the array `nums` and uses
 * only constant extra space.
 */
public class Question_4 {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 5, 3, 1 };
		int res = findDuplicate(nums);
		System.out.println("Result is " + res);
	}

	public static int findDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length;
		int dup = -1;
		while (low <= high) {
			int curr = (low + high) / 2;
			int count = 0;

			for (int n : nums) {
				if (n <= curr)
					count++;
			}

			if (count > curr) {
				dup = curr;
				high = curr - 1;
			} else

				low = curr + 1;
		}
		return dup;
	}

}
