package in.ineuron;

/**
 * <aside> 💡 **Question 3**
 * 
 * Given a linked list consisting of **L** nodes and given a number **N**. The
 * task is to find the **N**th node from the end of the linked list.
 * 
 * Input: N = 2 LinkedList: 1->2->3->4->5->6->7->8->9 Output:8 Explanation:In
 * the first example, there are 9 nodes in linked list and we need to find 2nd
 * node from end. 2nd node from end is 8. </aside>
 */
public class Question_3 {

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

		int n = 6;
		int res = findNthNode(l1, n);

		System.out.println("Result is " + res);

	}

	public static int findNthNode(ListNode head, int n) {

		ListNode slow = head;
		ListNode fast = head;

		for (int i = 0; i < n; i++)
			fast = fast.next;

		if (fast == null)
			return slow.val;

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.val;

	}

}
