
public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode current = head, end = head;
        int count = 1;
        while (count < n) {
        	end = end.next;
        	++count;
        }
        while (end.next != null) {
        	pre = pre.next;
        	current = current.next;
        	end = end.next;
        }
        pre.next = current.next;
        return current == head ? current.next : head;
    }
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}

