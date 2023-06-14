package in.ineuron;

/**
 * Given a linked list and two integers M and N. Traverse the linked list such
 * that you retain M nodes then delete next N nodes, continue the same till end
 * of the linked list.
 * 
 * Difficulty Level: Rookie
 * 
 * Input: M = 2, N = 2 Linked List: 1->2->3->4->5->6->7->8 Output: Linked List:
 * 1->2->5->6
 * 
 * Input: M = 3, N = 2 Linked List: 1->2->3->4->5->6->7->8->9->10 Output: Linked
 * List: 1->2->3->6->7->8
 * 
 * Input: M = 1, N = 1 Linked List: 1->2->3->4->5->6->7->8->9->10 Output: Linked
 * List: 1->3->5->7->9
 */
public class Question_6 {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;

		ListNode head = l1;

		System.out.println("List Before Removing ");
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

		int n = 1;
		int m = 1;
		ListNode res = linkdelete(l1, m, n);

		System.out.println();
		System.out.println("List Before Removing ");
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
	}

	public static ListNode linkdelete(ListNode head, int m, int n) {
		ListNode curr = head;
		ListNode t = head;

		while (curr != null) {

			for (int i = 1; i < m && curr != null; i++) {
				curr = curr.next;
			}

			if (curr == null)
				return head;

			t = curr.next;

			for (int j = 1; j <= n && t != null; j++) {
				t = t.next;
			}

			curr.next = t;
			curr = t;

		}

		return head;
	}

}
