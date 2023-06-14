package in.ineuron;

/**
 * Given a singly linked list of characters, write a function that returns true
 * if the given list is a palindrome, else false. 
 * 
 * Input: R->A->D->A->R->NULL >
 * **Output:** Yes **Input:** C->O->D->E->NULL > > **Output:** No >
 */
public class Question_4 {

	public static void main(String[] args) {

		ListNodeChar l1 = new ListNodeChar('r');
		ListNodeChar l2 = new ListNodeChar('a');
		ListNodeChar l3 = new ListNodeChar('d');
		ListNodeChar l4 = new ListNodeChar('a');
		ListNodeChar l5 = new ListNodeChar('r');

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		boolean res = isPalindrome(l1);

		System.out.println("Result is " + res);

	}

	public static boolean isPalindrome(ListNodeChar l1) {

		ListNodeChar slow = l1;
		ListNodeChar fast = l1;
		ListNodeChar prev = null;
		ListNodeChar temp = null;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		while (slow != null) {

			temp = slow.next;
			slow.next = prev;
			prev = slow;
			slow = temp;
		}

		while (prev != null) {

			if (l1.val != prev.val)
				return false;
			l1 = l1.next;
			prev = prev.next;

		}

		return true;
	}
}
