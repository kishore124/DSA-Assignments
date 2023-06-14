package in.ineuron;

/**
 * <aside> 💡 **Question 5**
 * 
 * Given a linked list of **N** nodes such that it may contain a loop.
 * 
 * A loop here means that the last node of the link list is connected to the
 * node at position X(1-based index). If the link list does not have any loop,
 * X=0.
 * 
 * Remove the loop from the linked list, if it is present, i.e. unlink the last
 * node which is forming the loop.
 * 
 * </aside>
 */
public class Question_5 {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;

		int res = removeLoop(l1);

		ListNode head = l1;

		System.out.println("Result is " + res);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}

	public static int removeLoop(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		boolean flag = false;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				flag = true;
				break;
			}
		}

		if (flag == false)
			return 0;
		else {
			remove(head, slow);
			return 1;
		}
	}

	private static void remove(ListNode head, ListNode slow) {

		while (head != slow) {
			slow = slow.next;
			head = head.next;
		}

		while (slow.next.next != head) {
			slow = slow.next;
		}
		slow.next.next = null;

	}

}
