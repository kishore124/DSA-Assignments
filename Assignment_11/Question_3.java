package in.ineuron;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array. `
 * 
 * 
 * Input: nums = [9,6,4,2,3,5,7,0,1] Output: 8 Explanation: n = 9 since there
 * are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number
 * in the range since it does not appear in nums. ```
 */
public class Question_3 {

	public static void main(String[] args) {
		int[] nums = { 9, 8, 4, 2, 3, 5, 7, 0, 1 };
		int res = missingNumber(nums);
		System.out.println("Result is " + res);
	}

	public static int missingNumber(int[] nums) {
		int M = 0;
		int l = 0;
		int h = nums.length;

		while (l <= h) {
			int curr = (l + h) / 2;
			int count = 0;
			for (int x : nums) {
				if (x <= curr) {
					count++;
				}
			}

			if (count != curr + 1) {
				M = curr;
				h = curr - 1;
			} else {
				l = curr + 1;
			}
		}
		return M;
	}
}
