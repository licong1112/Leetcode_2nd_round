
public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
        if (head.next == null) return head;
		
		ListNode previous = new ListNode(0);
        previous.next = head;
        helper(previous, head, head.next);
        return previous.next;
    }
	
	public void helper(ListNode previous, ListNode current, ListNode next) {
		previous.next = next;
		current.next = next.next;
		next.next = current;
		
		if (current.next == null || current.next.next == null) return;
		helper(current, current.next, current.next.next);
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

