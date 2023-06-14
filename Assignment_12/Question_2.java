package in.ineuron;

/**
 * Given a linked list of N nodes. The task is to check if the linked list has a
 * loop. Linked list can contain self loop.
 * 
 * Input: N = 3 value[] = {1,3,4} x(position at which tail is connected) = 2
 * Output:True Explanation:In above test case N = 3. The linked list with nodes
 * N = 3 is given. Then value of x=2 is given which means last node is connected
 * with xth node of linked list. Therefore, there exists a loop.
 */
public class Question_2 {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;

		// last link is connected to l2
		l7.next = l2;

		boolean res = hasCycle(l1);
		System.out.println("Result is " + res);

	}

	public static boolean hasCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}

		return false;

	}

}
