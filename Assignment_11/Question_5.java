package in.ineuron;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must be unique and you may return
 * the result in any order.
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [9,4] Explanation: [4,9]
 * is also accepted.
 */
public class Question_5 {

	public static void main(String[] args) {

		int[] nums2 = new int[] { 9, 4, 9, 8, 4 };
		int[] nums1 = new int[] { 4, 9, 5 };
		int[] res = intersection(nums1, nums2);
		System.out.println(Arrays.toString(res));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		HashSet<Integer> set = new HashSet<Integer>();
		for (int n : nums2) {
			if (find(nums1, n))
				set.add(n);
		}

		int[] res = new int[set.size()];
		int i = 0;

		for (int n : set) {
			res[i++] = n;
		}

		return res;
	}

	public static boolean find(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target)
				return true;
			else if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;

	}
}
