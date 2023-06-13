package in.ineuron;

/**
 * <aside> 💡 **Question 6**
 * 
 * Suppose an array of length `n` sorted in ascending order
 * is **rotated** between `1` and `n` times. For example, the array `nums =
 * [0,1,2,4,5,6,7]` might become:
 * 
 * - `[4,5,6,7,0,1,2]` if it was rotated `4` times. - `[0,1,2,4,5,6,7]` if it
 * was rotated `7` times.
 * 
 * Notice that **rotating** an array `[a[0], a[1], a[2], ..., a[n-1]]` 1 time
 * results in the array `[a[n-1], a[0], a[1], a[2], ..., a[n-2]]`.
 * 
 * Given the sorted rotated array `nums` of **unique** elements, return *the
 * minimum element of this array*.
 * 
 * You must write an algorithm that runs in `O(log n) time.`
 * 
 * Example:
 * Input: nums = [4,5,6,7,0,1,2] Output: 0 Explanation: The original
 * array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 * 
 * 
 * </aside>
 */
public class Question_6 {

	public static void main(String[] args) {

		int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		int res = finMin(nums);

		System.out.println(res);
	}

	public static int finMin(int[] nums) {

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (nums[mid] < nums[mid - 1]) {
				return nums[mid];
			} else if (nums[mid + 1] < nums[mid]) {
				return nums[mid + 1];
			} else if (nums[low] <= nums[mid])
				low = mid + 1;
			else if (nums[mid] <= nums[high])
				high = mid - 1;
		}

		return -1;
	}
}
