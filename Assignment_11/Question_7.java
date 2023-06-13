package in.ineuron;

import java.util.Arrays;

/**
 * Given an array of integers `nums` sorted in non-decreasing order, find the
 * starting and ending position of a given `target` value.
 * 
 * If `target` is not found in the array, return `[-1, -1]`.
 * 
 * You must write an algorithm with `O(log n)` runtime complexity.
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
 * 
 * Input: nums = [], target = 0 Output: [-1,-1]
 */
public class Question_7 {

	public static void main(String[] args) {

		int target = 2;
		int[] nums = new int[] { 1,2,3 };
		int[] res = searchRange(nums, target);
		System.out.println(Arrays.toString(res));
	}

	public static int[] searchRange(int[] nums, int target) {

		int[] res = new int[2];
		res[0] = -1;
		res[1] = -1;

		if (nums.length == 0)
			return res;

		int fo = occurance(nums, target, true);
		int so = occurance(nums, target, false);
		res[0] = fo;
		res[1] = so;
		return res;
	}

	public static int occurance(int[] nums, int target, boolean asc) {

		int low = 0;
		int high = nums.length - 1;
		int ans = -1;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (nums[mid] < target)
				low = mid + 1;

			else if (nums[mid] > target)
				high = mid - 1;
			else {
				ans = mid;
				if (asc) {
					high = mid - 1;
				} else
					low = mid + 1;
			}
		}
		return ans;
	}
}
