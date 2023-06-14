package in.ineuron;

/**
 * <aside> 💡 **Question 7**
 * 
 * Given two linked lists, insert nodes of second list into first list at
 * alternate positions of first list. For example, if first list is
 * 5->7->17->13->11 and second is 12->10->2->4->6, the first list should become
 * 5->12->7->10->17->2->13->4->11->6 and second list should become empty. The
 * nodes of second list should only be inserted when there are positions
 * available. For example, if the first list is 1->2->3 and second list is
 * 4->5->6->7->8, then first list should become 1->4->2->5->3->6 and second list
 * to 7->8.
 * 
 * Use of extra space is not allowed (Not allowed to create additional nodes),
 * i.e., insertion must be done in-place. Expected time complexity is O(n) where
 * n is number of nodes in first list.
 * 
 * </aside>
 */
public class Question_7 {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l10 = new ListNode(10);
		ListNode l11 = new ListNode(11);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next=l10;
		l10.next=l11;

		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);

		l6.next = l7;
		l7.next = l8;
		l8.next = l9;

		ListNode head1 = l1;

		System.out.println("List Before Removing ");
		while (head1 != null) {
			System.out.print(head1.val + " ");
			head1 = head1.next;
		}

		ListNode head2 = l6;

		System.out.println();
		System.out.println("List Before Removing ");
		while (head2 != null) {
			System.out.print(head2.val + " ");
			head2 = head2.next;
		}

		insertnodes(l6, l1);

		System.out.println();
		System.out.println("List After Merging");

		head1 = l6;
		while (head1 != null) {
			System.out.print(head1.val + " ");
			head1 = head1.next;
		}

	}

	public static void insertnodes(ListNode head1, ListNode head2) {

		ListNode temp1 = null;
		ListNode temp2 = null;

		ListNode l1 = head1;
		ListNode l2 = head2;

		ListNode lastNode = null;

		while (l1 != null && l2 != null) {

			lastNode = l1;

			temp1 = l1.next;
			temp2 = l2.next;

			l1.next = l2;
			l2.next = temp1;

			l1 = temp1;
			l2 = temp2;
		}
		if (l2 != null) {
			lastNode.next.next = l2;
		}

	}

}
