package in.ineuron;

import java.util.HashMap;

/*
 *  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice. 
    You can return the answer in any order.
    **Example:**
    Input: nums = [2,7,11,15], target = 9
    Output0 [0,1]

    **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]*/

public class Question_1 {

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 6, 7, 11, 15 };
		int target = 9;
		int[] res = twoSum(nums, target);

		if (res == null)
			System.out.println("NO RESULT");
		else
			System.out.println("Index are " + res[0] + " " + res[1]);
	}

	static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i]; // nums[i]+nums[j]==target
			if (map.containsKey(comp)) {
				return new int[] { map.get(comp), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
