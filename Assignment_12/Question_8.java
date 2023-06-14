package in.ineuron;

/**
 * <aside> 💡 **Question 8**
 * 
 * Given a singly linked list, find if the linked list
 * is [circular](https://www.geeksforgeeks.org/circular-linked-list/amp/) or
 * not.
 * 
 * A linked list is called circular if it is not NULL-terminated and all nodes
 * are connected in the form of a cycle. Below is an example of a circular
 * linked list. . >
 */
public class Question_8 {

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
		l7.next = l1;

		boolean res = isCircular(l1);
		System.out.println("Result is " + res);
	}

	public static boolean isCircular(ListNode head) {

		ListNode l = head.next;

		while (l != null && l != head) {
			l = l.next;
			if (l == head)
				return true;
		}

		return false;

	}

}
