package in.ineuron;

/**
 * <aside> 💡 **Question 1**
 * 
 * Given a singly linked list, delete **middle** of the linked list. For
 * example, if given linked list is 1->2->**3**->4->5 then linked list should be
 * modified to 1->2->4->5.If there are **even** nodes, then there would be **two
 * middle** nodes, we need to delete the second middle element. For example, if
 * given linked list is 1->2->3->4->5->6 then it should be modified to
 * 1->2->3->5->6.If the input linked list is NULL or has 1 node, then it should
 * return NULL
 * 
 * Input: LinkedList: 2->4->6->7->5->1 Output:2 4 6 5 1
 * 
 * </aside>
 */
public class Question_1 {

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

		ListNode head = l1;

		System.out.println("List Before Removing Middle");
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

		ListNode res = deleteMiddle(l1);

		System.out.println("\n\nList After Removing Middle");
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}

	}

	public static ListNode deleteMiddle(ListNode head) {

		if (head.next == null)
			return null;

		ListNode slow = head;
		ListNode fast = head.next.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		slow.next = slow.next.next;

		return head;

	}

}
