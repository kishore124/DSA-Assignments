package in.ineuron;

/*
 * <aside> 💡 **Q2.** Given an integer array nums and an integer val, remove all
 * occurrences of val in nums in-place. The order of the elements may be
 * changed. Then return the number of elements in nums which are not equal to
 * val.
 * 
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 * 
 * - Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val. The remaining elements of nums are not
 * important as well as the size of nums. - Return k.
 ** 
 * Example :** Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_*,_*]
 ** 
 * Explanation:** Your function should return k = 2, with the first two elements
 * of nums being 2. It does not matter what you leave beyond the returned k
 * (hence they are underscores)[
 * 
 * </aside>/ */
public class Question_2 {

	public static void main(String[] args) {

		int nums[] = new int[] { 3, 2, 2, 3 };

		int val = 3;
		int res = removeElements(nums, val);
		for (int i = 0; i < res; i++) {
			System.out.print(nums[i] + " ");
		}

	}

	public static int removeElements(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			// Checking if the element is not equal to value and adding it to the jth position
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

}
